package HomeWorkClass1;

import HomeWorkClass.Person;
import HomeWorkClass.Phone;

public class Main1 {
    public static void main(String[] args) {
// Класс Phone1
        Phone1 phone = new Phone1();
        phone.setNumber("791524136");
        phone.setModel("Samsung");
        phone.setWeight(123);
        phone.getNumber();
        phone.receiveCall("Леша");

        Phone1 phone1 = new Phone1();
        phone1.setNumber("711111111");
        phone1.setModel("Iphon");
        phone1.setWeight(456);
        phone1.getNumber();
        phone1.receiveCall("Вася");

        Phone1 phone2 = new Phone1();
        phone2.setNumber("7122222222");
        phone2.setModel("Honor");
        phone2.setWeight(4446);
        phone2.getNumber();
        phone2.receiveCall("Петя");


        System.out.println(phone.getModel() + " " + phone.getNumber() + " " + phone.getWeight());
        System.out.println(phone1.getModel() + " " + phone1.getNumber() + " " + phone1.getWeight());
        System.out.println(phone2.getModel() + " " + phone2.getNumber() + " " + phone2.getWeight());


        //Класс Person

        Person1 person = new Person1(" Andrey", 18);
        Person1 person2 = new Person1();
        person.talk(person.getFullName());
        person2.move("alena");


    }
}
