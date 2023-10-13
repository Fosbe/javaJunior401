package HomeWorkClass;

public class Phone {
    //Создаем переменные
    public String number;
    public String model;
    public int weight;

    // создаем конструкторы
    // Контсруктор принемает 3 параметра
    public Phone (String number, String model,int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    // конструктор принемает 2 параметра
    public Phone (String number, String model) {
        this.number = number;
        this.model = model;
    }
    // конструктор без параметров
    public Phone() {
    }

    // создание методов
    public String getNumber() {
        return number;
    }
    public static void receineCall(String name) {
        System.out.println("Звонит " + name);
    }

}
