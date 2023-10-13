package lesson6;

import java.util.concurrent.ThreadLocalRandom;

public class SaperUtils {

    public static void fillMines(int[][] field) {
        for (int mine = 0; mine < 10; mine++) {
            int raw = ThreadLocalRandom.current().nextInt(0, 9);
            int col = ThreadLocalRandom.current().nextInt(0, 9);
            if (field[raw][col] == -1) {
                mine--;
            } else {
                field[raw][col] = -1;
            }
        }
    }

    public static void insertNumsAroundMines(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == -1) {
                    if (i == 0 && j == 0) { //верхний левый угол
                        if (field[i][j + 1] != -1)// если не мину то увилдичиваем клетку на 1 соседа справа
                            field[i][j + 1] += 1;
                        if (field[i + 1][j + 1] != -1)// если не мину то увилдичиваем клетку на 1 соседа справа
                            field[i + 1][j + 1] += 1;
                        if (field[i + 1][j] != -1)// если не мину то увилдичиваем клетку на 1 соседа справа
                            field[i + 1][j] += 1;
                    }
                    int lastJ = field[i].length - 1;
                    int lastI = field.length - 1;
                    if (field[i][j] == -1) {
                        if (i == 0 && j == lastJ) { //верхний правый угол
                            if (field[i][j - 1] != -1)// если не мину то увилдичиваем клетку на 1 соседа справа
                                field[i][j - 1] += 1;
                            if (field[i - 1][j - 1] != -1)// если не мину то увилдичиваем клетку на 1 соседа справа
                                field[i - 1][j - 1] += 1;
                            if (field[i + 1][j] != -1)// если не мину то увилдичиваем клетку на 1 соседа справа
                                field[i + 1][j] += 1;
                        }

                        if (i != 0 && j != 0 && j != lastJ && i != lastI) {
                            // расстановка цифр на центральное поле
                            if (field[i - 1][j - 1] != -1)
                                field[i - 1][j - 1] += 1;
                            if (field[i - 1][j] != -1)
                                field[i - 1][j] += 1;
                            if (field[i - 1][j + 1] != -1)
                                field[i - 1][j + 1] += 1;
                            if (field[i][j - 1] != -1)
                                field[i][j - 1] += 1;
                            if (field[i][j + 1] != -1)
                                field[i][j + 1] += 1;
                            if (field[i + 1][j - 1] != -1)
                                field[i + 1][j - 1] += 1;
                            if (field[i + 1][j] != -1)
                                field[i + 1][j] += 1;
                            if (field[i + 1][j + 1] != -1)
                                field[i + 1][j + 1] += 1;
                        }

                    }

                }

            }

        }
    }

    public static void printField(int[][]field,boolean[][]mask){
        for (int i=0;i<field.length;i++){
            for (int j=0;j<field[i].length;j++){
                if(mask[i][j]) {
                    System.out.print(field[i][j] + " ");
                }else{
                    System.out.print("X" + " ");
                }
            }
            System.out.println();
        }
    }

}


