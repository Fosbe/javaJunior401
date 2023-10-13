package HomeWork;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void mass() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("высота:");
            int number = scanner.nextInt();
            System.out.println("ширина:");
            int number2 = scanner.nextInt();
            int[][] field = new int[number][number2];
            for (int i = 0; i < field.length; i++) {
                int raw = ThreadLocalRandom.current().nextInt(0, number );
                int col = ThreadLocalRandom.current().nextInt(0, number2 );
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
    }





