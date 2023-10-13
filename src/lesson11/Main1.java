package lesson11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        //проход по колекции
        // 1 - с помощью for - только в коллекциях, где есть индексы
        // 2 - с помощью for each - можно пройтись по коллекциям, но не изменить ее
        // 3 - с помощью итератора - может пройтись и модернизировать коллекцию

        TreeSet<Integer> texts = new TreeSet<>(new ReversNumsComparator());
        // int --- Integer
        texts.add(8);
        texts.add(4);
        texts.add(3);
        texts.add(5);
        texts.add(33);
        texts.add(6);
        texts.add(2);
        for(Iterator<Integer> iterator = texts.iterator(); iterator.hasNext() ;  ){
            System.out.println(iterator.next());
        }

    }
}
