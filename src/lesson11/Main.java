package lesson11;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
      /*LinkedList<String> text  = new LinkedList<>();
        text.add("000");
        text.add("111");
        text.add("222");
        text.add("333");
        text.add(3,"!!!");
        text.set(0,"@@@");
        System.out.println(text);
        1 января 1971 год
*/
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long time1 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            arrayList.add("qwerty " + i);
        }
        long time2 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedList.add("qwerty " + i);
        }
        long time3 = System.currentTimeMillis();
        System.out.println("ArrayList"+"-"+ (time2-time1));
        System.out.println("linkedList"+ "-"+(time3-time2));






        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        long time4 = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        long time5 = System.currentTimeMillis();


        System.out.println("ArrayList get"+"-"+ (time4-time3));
        System.out.println("linkedList get"+ "-"+(time5-time4));


    }
}

