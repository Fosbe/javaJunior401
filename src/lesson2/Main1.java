package lesson2;

public class Main1 {

    public static void main(String[] args) {
        //управлдяющие констпукции
        //if
        // switch
        //есть три стороны треугольника . Вывести на консоль какой это треугольник .
        // Разносторонний равнобедренный или равносторонний

        int a = 10;
        int b = 8;
        int c = 10;

        if (a != b && b != c && c != a) {
            System.out.println("это разносторонний треугольник");
        } else if (a == b && b == c && c == a) {
            System.out.println("Это равносторонний треугольник");
        } else {
            System.out.println("Это равнобедренный треугольник");
        }
    }
}
