package HomeWorkClass;

public class Person {
    private String fullName;

    private int age;

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

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person(){

    }

    public static void Talk(String fullName, int age) {

        System.out.println("Звонит " + fullName + "Говорит");
    }


    public static void move(String fullName) {
        System.out.println("Звонит " + fullName + "Говорит");

    }

}


