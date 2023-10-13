package lesson2;

public class Main6 {
    public static void main(String[] args) {
        // напечатать на консоль числа которые деляться на 3 и на 5 без остатка в диапозоне от 30 до 100

        for (int i = 30; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }

        }
    }
}
