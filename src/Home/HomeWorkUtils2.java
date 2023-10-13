package Home;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkUtils2 {
    //здача 3.1
    public static void z3() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("задайте длинну массива");
        int number = scanner.nextInt();
        System.out.println(" " + number);

        int j = 0;
        int[] field = new int[number];
        for (int i = 0; i < number; i++) {


            int raw = ThreadLocalRandom.current().nextInt(0, number);

            field[i] = (int) (Math.random() * 100 + 1);
            System.out.println(field[i]);
        }
        System.out.println("Ваш масив заполнен рандомными числами ");
    }

    //задача 4.1
    public static void monthsSelect(int monthsNum) {
        String[] months = {" ", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        for (int i = 1; i < months.length; i++) {
            if (monthsNum > 12) {
                System.out.println("нет такого месяца");
            } else {
                System.out.println("Вы ввели " + monthsNum + " это - " + months[monthsNum]);
            }
        }
    }

    // задача 5.1
    public static void buildingTriangle2(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = p * (p - a) * (p - b) * (p - c);
        s = Math.sqrt(s);
        if (a >= 0.1 && b >= 0.1 && c >= 0.1) {
            System.out.println("Нормальный треугольник. Площадь " + s + " см² ");
        } else {
            System.out.println("Физически Вы не сможете нарисовать такой треугольник площадью "
                    + s + " см². оцените свои возможности реально и введите нормальные размеры в сантиметрах!");
        }
    }
    //задача 5.2

    public static void buildingTriangle(int a, int b, int c) {
        if ((a <= 0 || b <= 0 || c <= 0) ||
                (a + b <= c || b + c <= a || a + c <= b)) {
            System.out.println("такой треугольник не может быть создан");
        } else {
            if (a != b && b != c && c != a ) {
                System.out.println("это разносторонний треугольник");
            } else if (a == b && b == c && c == a ) {
                System.out.println("Это равносторонний треугольник");
            } else {
                System.out.println("Это равнобедренный треугольник");
            }
        }
    }
}
