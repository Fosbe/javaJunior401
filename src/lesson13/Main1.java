package lesson13;

public class Main1 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.addProduct("Бананы",3);
        fridge.addProduct("Сливы",1);
        fridge.addProduct("Кедровые орешки",5);
        fridge.addProduct("Помидоры",2);
        fridge.addProduct("Сыр",1);
        fridge.addProduct("Сосиски",3);
        fridge.addProduct("Сордельки",5);
//        fridge.getProduct("Бананы",4 );
//        fridge.printAllProducts();
        fridge.produktFinal();

    }
}
