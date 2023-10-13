package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkSapper {
    public static void main(String[] args) {
        System.out.println("выберите уровень");
        System.out.println("новичок - введите '1'");
        System.out.println("любитель - введите '2'");
        System.out.println("проффесионал - введите '3'");
        System.out.println("особый уровень - введите '4'");


        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();

        if (level.equalsIgnoreCase("1")) {
            int[][] field = new int[9][9];
            for (int i = 0; i < 10; i++) {



                int raw = ThreadLocalRandom.current().nextInt(0, 9);
                int col = ThreadLocalRandom.current().nextInt(0, 9);
                if (field[raw][col] != 0) {
                    i--;
                } else {
                    field[raw][col] = 1;

                }

            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");

                }
                System.out.println();
            }
        }
        if (level.equalsIgnoreCase("2")) {
            int[][] field = new int[15][15];
            for (int i = 0; i < 15; i++) {



                int raw = ThreadLocalRandom.current().nextInt(0, 15);
                int col = ThreadLocalRandom.current().nextInt(0, 15);
                if (field[raw][col] != 0) {
                    i--;
                } else {
                    field[raw][col] = 1;

                }

            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");

                }
                System.out.println();
            }
        }

        if (level.equalsIgnoreCase("3")) {
            int[][] field = new int[30][30];
            for (int i = 0; i < 30; i++) {



                int raw = ThreadLocalRandom.current().nextInt(0, 30);
                int col = ThreadLocalRandom.current().nextInt(0, 30);
                if (field[raw][col] != 0) {
                    i--;
                } else {
                    field[raw][col] = 1;

                }

            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");

                }
                System.out.println();
            }
        }
        if (level.equalsIgnoreCase("4")) {


            System.out.println("высота:");
            int number = scanner.nextInt();
            System.out.println("ширина:");
            int number2 = scanner.nextInt();
            System.out.println("кол-во мин:");
            int number3 = scanner.nextInt();

            int[][] field = new int[number][number2];
            for (int i = 0; i < number3; i++) {


                int raw = ThreadLocalRandom.current().nextInt(0, number );
                int col = ThreadLocalRandom.current().nextInt(0, number2 );
                if (field[raw][col] != 0) {
                    i--;
                } else {
                    field[raw][col] = 1;

                }

            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");

                }
                System.out.println();
            }
        }
    }
}
