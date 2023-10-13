package HomeWork;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Utils {
    //Создать методы:
    //1) Метод принимает входящими параметрами текст, и возвращает кол-во гласных букв в тексте
    public static String vowels(String stringToProc) {
        char[] vocalArr = new char[]{'а', 'я', 'у', 'ю', 'о', 'е', 'ё', 'э', 'и', 'ы', 'a', 'e', 'i', 'o', 'u', 'y',
                'А', 'Я', 'У', 'Ю', 'О', 'Е', 'Ё', 'Э', 'И', 'Ы', 'A', 'E', 'I', 'O', 'U', 'Y'};
        int counter = 0;
        char[] arrayToProc = stringToProc.toCharArray();
        for (char ch : arrayToProc) {
            for (char ch2 : vocalArr) {
                if (ch == ch2) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        return stringToProc;
    }

    //2) Метод принимает входящими параметрами текст, печатает на консоль этот же текст, только в обратном порядке
    public static void reverseText(String inputString) {
        int stringLength = inputString.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = inputString.charAt(i) + result;
        }
        System.out.println(result);
    }

    //2.1
    public static void reversText2(String inputString) {

        String reversedString = new StringBuffer(inputString).reverse().toString();
        System.out.println(reversedString);

    }

    //3) Метод принимает входящими параметрами текст, и печатает на консоль сколько в тексте знаков пунктуации
    public static void foamMarks(String stringToProc) {
        char[] vocalArr = new char[]{'.', '?', '!', ',', ';', ':','-', '(', ')'};
        int counter = 0;
        char[] arrayToProc = stringToProc.toCharArray();
        for (char ch : arrayToProc) {
            for (char ch2 : vocalArr) {
                if (ch == ch2) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
    //4) В метод передаем кол-во строк и кол-во колонок, метод печатает на консоль квадрат из единичек по этим параметрам

    public static void mass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("высота:");
        int number = scanner.nextInt();
        System.out.println("ширина:");
        int number2 = scanner.nextInt();
        int[][] field = new int[number][number2];
        for (int i = 0; i < field.length; i++) {
            int raw = ThreadLocalRandom.current().nextInt(0, number);
            int col = ThreadLocalRandom.current().nextInt(0, number2);
            if (field[raw][col] != 0) {
                i--;
            } else {
                field[raw][col] = 0;

            }
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = 1;
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    //4.1

    public static int mass2(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = 1;
            }
        }
        for (int[] anArr : mass) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
        return 0;
    }
}

