package BlackJack;

import java.util.ArrayList;

public class BlackJack {

    private ArrayList<Player> players = new ArrayList<>();

    public void addPlayerToGame(Player player) {
        players.add(player);
    }

    public void dealTwoCardsToAllPlayers(Koloda koloda) {
        for (Player p : players) { // проходимся по всем игрокам даже и по крупье
            p.addCardToHand(koloda.getRandomCard());
        }
        for (Player p : players) { // проходимся по всем игрокам даже и по крупье
            p.addCardToHand(koloda.getRandomCard());
        }
    }

    //метод который будет раздавать все нужные карты всем игрокам
    // пока не скажут стоп слово
    public void dealAllNeedCards(Koloda koloda) {
        for (Player p : players) {       // прохожусь по всем игрокам и крупье
            while (p.needMoreCards()) {
                p.addCardToHand(koloda.getRandomCard());

            }
        }

    }

    public void printWinner() {
        // 24  26  25  27 - победил дилер
        // 24  19  25  27 - победил у кого недобор
        // 21  21  21  27 - победили трое
        // 18  16  25  12 - победилите у кого ближе к 21

        for (Player p : players) { // проходимся , устанавливаем флаг фолс тем кто не может прртендовать на победу
            if (p.countBallInHand() > 21) {
                p.setCanWin(false);
            }
        }
        // если у всех перебор выиграл круаье
        if (countPlayersWhoCanWin() == 0) {
            for (Player p: players){
                if(p instanceof Dealer){
                    System.out.println("Победил диллер!!! Его карты: ");
                    p.openHand();
                    return;
                }
            }
        }
        //если в игре остался только один
        if(countPlayersWhoCanWin()==1){
            for (Player p: players){
                if(p.isCanWin()){
                    System.out.println("Выиграл " + p.getName() + "! Его карты");
                    p.openHand();
                    return;
                }
            }
        }
        // Ищем максимальный бал к 21
        int ballWinner = -1;
        for (Player p: players){
            if(p.isCanWin() && p.countBallInHand() > ballWinner){
                ballWinner = p.countBallInHand();
            }
        }
        // узнали бал победителя и печатаем тех игроков у кого такой бал ( их может быть несколлько )
        for (Player p: players){
            if(p.countBallInHand() == ballWinner){
                System.out.println("Победитель " + p.getName()+ " Его карты: ");
                p.openHand();
            }
        }
    }

    private int countPlayersWhoCanWin() {
        int count = 0;
        for (Player p : players) {
            if (p.isCanWin()) {
                count++;
            }
        }
        return count;
    }
}
