package lesson13;

import java.util.*;

public class Fridge {
    private HashMap<String, Integer> products = new HashMap<>();
    private int capacity = 500;

    public void addProduct(String product, int weight) {
        if (products.containsKey(product)) {
            products.put(product, weight + products.get(product));
        } else {
            products.put(product, weight);
        }
    }

    public void printAllProducts() {
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }

    public void getProduct(String product, int weigt) {
        // 1 если такого нет продукта - проверка на содержание переменной в нхолодильника
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта в холодильнике нет ");
            return;
        }
        // 2 делаем проверку есть ли там столько
        if (products.get(product) < weigt) {
            System.out.println("Не достаточно " + product + "в холодильнике ");
            products.remove(product);
            return;
        }
        //3 если все хвататет то затираем значения что было и ставим - то что забрали

        if (products.get(product) == weigt) {
            products.remove(product);
            return;
        }
        products.put(product, products.get(product) - weigt);

    }

    //1 метод должен выводить на консоль те продуукты которые скоро закончатся ( те которых меньше 2 кг )
    public void produktFinal() {

        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getValue() <= 2) {
                System.out.println(product.getKey() + " этих продуктов осталось мало ");
            }
        }
    }

    public void printLargestProduct1() {
        System.out.print("Больше всего в холодильнике: ");
        int largestWeight = 0;
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getValue() > largestWeight)
                largestWeight = product.getValue();
        }
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getValue() == largestWeight) {
                System.out.print(product.getKey() + "; ");
            }
        }
        System.out.println();
    }


    //2 Вывести на консоль продукт которого больше всего

    public void printLargest() {
        System.out.print("Больше всего в холодильнике: ");
        int largestWeight = 0;
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getValue() > largestWeight)
                largestWeight = product.getValue();
        }
        for (Map.Entry<String, Integer> product : products.entrySet()) {
            if (product.getValue() == largestWeight) {
                System.out.print(product.getKey() + "; ");
            }
        }
        System.out.println();
    }

    //3 вывести на консоль продукты осортированы по названию ( надо смотреть в интернете как сортировать мэпы)
    public void printProductsSortByName() {
        TreeMap<String, Integer> sortedProducts = new TreeMap<>(products);
        for (Map.Entry<String, Integer> product : sortedProducts.entrySet()) {
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }
    //4*** вывести на консоль продукты осортированы по весу от меньшего
    public void printProductsSortByWeightFromTo() {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(products.entrySet());
        Collections.sort(list, Map.Entry.comparingByValue());
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> product : list) {
            sortedMap.put(product.getKey(), product.getValue());
        }

        for (Map.Entry<String, Integer> product : sortedMap.entrySet()) {
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }
}



