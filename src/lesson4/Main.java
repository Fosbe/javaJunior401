package lesson4;

public class Main {
    public static void main(String[] args) {

        int[] nums = {23, 56, 43, 444, 556, 4, 334,};
        //for eahc - проход по массиву
         //for  - проход по массиву ( сокращенная версия)

        for( int n : nums){
            //число преоброзовывем в текст
            String numInText = n +"";
           if (numInText.contains("4")){
               System.out.println(numInText);
           }
        }
    }
}
