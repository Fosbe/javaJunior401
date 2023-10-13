package lesson1;

public class Main1 {
    public static void main(String[] args) {
        int money = 1000;
        int priceOfSnikers=35;
        double priceOfCandy=3.5;

        int countSnikersCanBuy =  money/priceOfSnikers;
        int restOfMoneyAfterSnikersBuy = money % priceOfSnikers;


        int countCandyBuy = (int) (restOfMoneyAfterSnikersBuy / priceOfCandy);

        double remainder =  money - (priceOfSnikers * countSnikersCanBuy + priceOfCandy * countCandyBuy);

        System.out.println(countSnikersCanBuy);
        System.out.println(countCandyBuy);
        System.out.println(remainder);
    }
}
