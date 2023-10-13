package lesson1;

public class Main2 {
    public static void main(String[] args) {
        int target = 10000;
        int capital = 2;
        int dayInWeek =7;
        int dayInYear = 365;

        int weekInYear = dayInYear / dayInWeek;

        int howMathDay = target / capital;

        int howMathYears =  howMathDay / weekInYear;
        System.out.println(howMathYears);

    }

}
