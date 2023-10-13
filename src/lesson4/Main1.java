package lesson4;

public class Main1 {
    public static void main(String[] args) {
        //создать квадрат 9на9 заполненый нулями и напечать на консоль

        int[][] nums = new int[9][9];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {         // то что нужно !!!
                System.out.print(nums[j][j] + " ");
            }
            System.out.println();

//        System.out.print(nums[0][0] +" ");
//        System.out.print(nums[0][1] +" ");
//        System.out.print(nums[0][2] +" ");
//        System.out.println();
//
//
//        System.out.print(nums[1][0] +" ");
//        System.out.print(nums[1][1] +" ");     ИНДУСКИЙ КОД
//        System.out.print(nums[1][2] +" ");
//        System.out.println();
//
//
//        System.out.print(nums[2][0] +" ");
//        System.out.print(nums[2][1] +" ");
//        System.out.print(nums[2][2] +" ");
//        System.out.println();


//            System.out.print(nums[2][0] + " ");
//            System.out.print(nums[2][1] + " "); полуиндуский код
//            System.out.print(nums[2][2] + " ");

        }

    }
}
