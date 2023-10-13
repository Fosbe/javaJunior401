package lesson4;

public class Mian2 {
    public static void main(String[] args) {
        //есть 2-х мерный массив ноликов
        // нужно напечатать на консоль только его диагональ
        // вместо остальных ячеек путота

        int[][] nums = new int[9][9];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i + j == nums.length - 1) {
                    System.out.print(nums[j][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();
        }
    }
}
