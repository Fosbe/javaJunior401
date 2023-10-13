package lesson7;

public class Main1 {
    public static void main(String[] args) {
        Person vasya = new Person();
        //vasya.age = 23;
        //vasya.name = "Васяня"; говнокод
        vasya.setAge(17);
        vasya.setNane("Васяня");

        Person olya = new Person();
        olya.setAge(25);
        olya.setNane("Оля");

        System.out.println();

    }
}
