package HomeWorkClass1;

public class Phone1 {
    //создание переменных
    private String number;
    private String model;
    private int weight;

    private String nameIsCall;

    // создаем конструкторы
    // Контсруктор принемает 3 параметра
    public Phone1(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // конструктор принемает 2 параметра
    public Phone1(String number, String model) {
        this.number = number;
        this.model = model;
    }

    // конструктор без параметров
    public Phone1() {
    }

    public String getNumber() {

        return number;
    }

    public void setNumber(String number) {

        this.number = number;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    //создаем метод
    public void receiveCall(String nameIsCall) {
        this.nameIsCall = nameIsCall;
        System.out.println("звонит " + nameIsCall);
    }



}
