package lesson2;

import java.time.Year;

public class HomeWork5 {
    public static void main(String[] args) {
        // сколько мы соберем денег с банка если оставим 10000 рублей
        // на 5 лет под 9 процентов годовых
        // помесячная капитализация

        int money = 10000;
        int year = 5;
        int procent = 9;

        for (int month = 1; month <= year * 12; month ++ ){
            money = money + ((money / 100*procent)/12);

        }
        System.out.println(money);
    }
}
