package lesson2;

public class HomeWork4 {
    public static void main(String[] args) {


        int minutesInHours = 60;
        int secondsInMinute = 60;
        int hoursInDay = 24;
        int seconds = 0;

        for (int secondsInDay = 1; secondsInDay <= hoursInDay; secondsInDay ++ ) {
            seconds = seconds + (minutesInHours * secondsInMinute);
        }
        System.out.println(seconds);
    }
}
