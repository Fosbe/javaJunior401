package lesson3;

public class HomeWork41 {
    public static void main(String[] args) {
        int[] nums = {12, 22, 34, 55, 4, 46, 64, 44, 23};
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
            if (str[i].indexOf('4') != -1) {
                System.out.println(str[i]);
            }
        }
    }
}
