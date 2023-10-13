package HomeWorkClass1;

public class Person1{

    // переменные
    private String fullName;
    private int age;
//Создание контсруктора

    public Person1(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person1(){
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // создание методов
    public static void move(String fullName) {
        System.out.println( fullName + " Говорит");

    }

    public static void talk(String fullName) {
        System.out.println( fullName + " Говорит");

    }

}
