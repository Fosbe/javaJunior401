package Home;

public class Main {
    public static void main(String[] args) {
        //задача 1
        int[][]numbers = {{1,2,2},{1,2,2},{1,1,2}};
        HomeWorkUtils.evenNumbers(numbers);

        //задача 2
        int num0; int num1; int num2; int num3; int num4;
        HomeWorkUtils.minNums(2,3,-4,6,4);

        //задача 3
        int[]numbersR = new int[16];
        HomeWorkUtils.randomMas(numbersR);

        //задача 4
        int calendar = 04;
        HomeWorkUtils.calendar(String.valueOf(calendar));

        // задача 5
        int a; int b; int c;
        HomeWorkUtils.buildingTriangle(2,2,4);

        //задача 3.1
        HomeWorkUtils.randomMas2();
    }
}









