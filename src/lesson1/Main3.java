package lesson1;

public class Main3 {
    public static void main(String[] args) {
        int dayInYear = 365;
        int capital = 2;
        int target = 10000;
        int dayInWeek = 7;

        int howMuchWeekInYaer = dayInYear / dayInWeek;
        int howMathMoneyPerYear = howMuchWeekInYaer * capital;
        int howMoneyYearsToSave = target / howMathMoneyPerYear;
        System.out.println(howMoneyYearsToSave);

        System.out.println(howMuchWeekInYaer);
    }
}
