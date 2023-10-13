package Home;

import java.util.Scanner;

public class HomeUtils {
    public static void calendar2() {

        System.out.println("введите число");
        Scanner scanner = new Scanner(System.in);
        String mouth = scanner.next();
        if (mouth.equalsIgnoreCase("01") || mouth.equalsIgnoreCase("1")) {
            System.out.println("январь");
        } else if (mouth.equalsIgnoreCase("02") || mouth.equalsIgnoreCase("2")) {
            System.out.println("февраль");
        } else if (mouth.equalsIgnoreCase("03") || mouth.equalsIgnoreCase("3")) {
            System.out.println("март");
        } else if (mouth.equalsIgnoreCase("04") || mouth.equalsIgnoreCase("4")) {
            System.out.println("апрель");
        } else if (mouth.equalsIgnoreCase("05") || mouth.equalsIgnoreCase("5")) {
            System.out.println("май");
        } else if (mouth.equalsIgnoreCase("06") || mouth.equalsIgnoreCase("6")) {
            System.out.println("июнь");
        } else if (mouth.equalsIgnoreCase("07") || mouth.equalsIgnoreCase("7")) {
            System.out.println("июль");
        } else if (mouth.equalsIgnoreCase("08") || mouth.equalsIgnoreCase("8")) {
            System.out.println("август");
        } else if (mouth.equalsIgnoreCase("09") || mouth.equalsIgnoreCase("9")) {
            System.out.println("сентябрь");
        } else if (mouth.equalsIgnoreCase("10")) {
            System.out.println("октябрь");
        } else if (mouth.equalsIgnoreCase("11")) {
            System.out.println("ноябрь");
        } else if (mouth.equalsIgnoreCase("12")) {
            System.out.println("декабрь");
        } else {
            System.out.println("месяцев всего 12, какой по счету Вас интересует ?");

        }
        calendar2();
    }
}
