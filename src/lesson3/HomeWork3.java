package lesson3;

public class HomeWork3 {
    public static void main(String[] args) {
        int[] nums = {12, 2, 11, 443, 55};
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
            if (i % 3 == 0) {
                System.out.println(nums[i]);
            }

        }




    }
}

