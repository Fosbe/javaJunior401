package lesson3;

import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] args) {
        int [] nums = new int [9];
        String[]str = new String[nums.length];
        for(int i =0;i<nums.length;i++){
            nums[i]=(int)(Math.random()*100+1);
            System.out.println(nums[i]);


        }

        for (int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
            if(str[i].indexOf('4')!=-1){
                System.out.println("числа с символом !4! "+ str[i]);
            }
        }

    }

}
