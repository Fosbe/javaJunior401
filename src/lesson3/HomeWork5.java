package lesson3;

import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 15};
        int sum = Arrays.stream(nums).sum();

        System.out.println(sum);

    }

}