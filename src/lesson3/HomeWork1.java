package lesson3;

public class HomeWork1 {
    public static void main(String[] args) {
        int[] mas = {23, 44, 55, 54, 27, 75, 44,};
        int result = 0;


        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                result++;
            }

        }
        System.out.println(result);

    }
}
