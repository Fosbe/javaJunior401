package lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("выберите уровень");
        System.out.println("новичок");
        System.out.println("любитель");
        System.out.println("проффесионал");
        System.out.println("особый уровень");
//формула создания любого ссылочного типа

        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();

        if (level.equalsIgnoreCase("новичок")) {
            int[][] field = new int[9][9];
            for (int i = 0; i < 10; i++) {

                //нужно поставить рандомно одну мину

                int raw = ThreadLocalRandom.current().nextInt(0, 9);
                int col = ThreadLocalRandom.current().nextInt(0, 9);
                if (field[raw][col] != 0) {  // если есть мина в клетка уже
                    i--;
                }

                else { // если нет в клетке мины
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
        if (level.equalsIgnoreCase("любитель")) {
            int[][] field = new int[15][15];
            for (int i = 0; i < 15; i++) {

                //нужно поставить рандомно одну мину

                int raw = ThreadLocalRandom.current().nextInt(0, 15);
                int col = ThreadLocalRandom.current().nextInt(0, 15);
                if (field[raw][col] != 0) {  // если есть мина в клетка уже
                    i--;
                }

                else { // если нет в клетке мины
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

        if (level.equalsIgnoreCase("проффесионал")) {
            int[][] field = new int[30][30];
            for (int i = 0; i < 30; i++) {

                //нужно поставить рандомно одну мину

                int raw = ThreadLocalRandom.current().nextInt(0, 30);
                int col = ThreadLocalRandom.current().nextInt(0, 30);
                if (field[raw][col] != 0) {  // если есть мина в клетка уже
                    i--;
                }

                else { // если нет в клетке мины
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
