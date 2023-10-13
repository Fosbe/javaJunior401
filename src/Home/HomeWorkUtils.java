package Home;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkUtils {
    //задача 1 метод принимает входящими параметрами двухмерный массив с числами.
// И возвращает из метода кол-во четных чисел в двухмерном массиве
    public static void evenNumbers(int[][] numbers) {
        int res = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (numbers[i][j] % 2 == 0) {
                    res = res + 1;
                }
            }
        }
        System.out.println("Количество чётных чисел " + res);
    }

    // задача 2 метод принимает входящим параметром 5 чисел, и печатает на консоль меньшее из них
    public static void minNums(int num0, int num1, int num2, int num3, int num4) {
        int[] numbers1 = {num0, num1, num2, num3, num4};
        int res = 0;
        for (int i = 0; i < numbers1.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers1.length; j++) {
                if (numbers1[i] <= numbers1[j]) {
                    res = numbers1[i];
                    count++;
                    if (count == numbers1.length) {
                        System.out.println("Минимальное число " + res);
                    }
                }
            }
        }
    }

    // задача 3 метод принимает входящим параметром одномерный массив чисел.
// Метод заполняет данный массив любыми числами рандомно, и возвращает заполненный массив
    public static void randomMas(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100 + 1);
            System.out.println(nums[i]);
        }
        System.out.println("ваш массив заполнился рондомными цифрами");
    }

    //здача 3.1
    public static void randomMas2() {
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

    // задача 4 метод принимает входящим параметром цифру от 1 до 12,
// и возвращает слово - эквивалент месяца.
// Например в метод передали 02 - метод вернул слово ФЕВРАЛЬ

    public static void calendar(String mouth) {
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
    }

    // задача 5 метод принимает 3 стороны треугольника.
    // И пишет на консоль это реальный треугольник или нет.
    // Реальным считается тот треугольник, который можно нарисовать на бумаге по тем сторонам, которые задали.

    public static void buildingTriangle(int a, int b, int c) {
        if (a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("не может быть такого треугольника");
        } else {
            System.out.println("такой треугольник существует");
        }
    }
}
