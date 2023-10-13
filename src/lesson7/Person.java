package lesson7;

public class Person {
    // объявление характеристик
   private int age;

   private String name;
   private String surname;
   private String phoneNumber;
   private String adres;


    public void setAge(int age){ //присваевыем возраст
        this.age = age;
    }

    public void setNane (String name){ // присваевываем имя
        this.name = name;              //объект у которого вызывн текущий метод
    }
    public int getAge(){  // спрашиваем возраст
        return age;
    }
    public String getName(){ // спрашиваем имя
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        // thus - я ( у меня) объект у которого вызван текущий метод
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
