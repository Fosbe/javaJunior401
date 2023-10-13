package lesson1;

public class Main4 {
    public static void main(String[] args) {
        int rommLenght = 5;
        int rommWidth = 7;

        double tableWidth = 2.3;
        double tableLenght = 1.2;

        int roomArea = rommWidth * rommLenght;
        double tableArea = tableWidth * tableLenght;
        int howManyTablesAreInRoom = (int) (roomArea / tableArea) ;

        System.out.println(howManyTablesAreInRoom);

    }
}
