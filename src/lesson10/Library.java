package lesson10;



import java.util.ArrayList;

public class Library {

    private ArrayList<PrintEdition> editions = new ArrayList<>();

    public void fillEditions(){
        Book book1 = new Book("Азбука",1930,"АБВ","Ивнаов", 30);
        Book book2 = new Book("НеАзбука",1931,"ГДЕ","Ивнаов", 40);
        Book book3 = new Book("Азбука",1932,"ЖЗИ","Ивнаов", 50);
        Book book4 = new Book("Азбука",1933,"КЛМ","Ивнаов", 60);
        Jurnal jurnal1 = new Jurnal("",2020,"",7);
        Jurnal jurnal2 = new Jurnal("fvdfv",2025,"vddd",8);
        editions.add(book1);
        editions.add(jurnal1);
        editions.add(book2);
        editions.add(jurnal2);
        editions.add(book3);
        editions.add(book4);
    }

    public void printAllEditions(){
        for (PrintEdition edition: editions){
            System.out.println(edition);
        }
    }

    public void printLargestBook(){
        PrintEdition largest = new Book("заглушка",1999,"dwcjdc","xsx",-1);
        for (PrintEdition edition: editions){
            if(edition instanceof Book){
                if(((Book) edition).getPages()>((Book) largest).getPages()){
                    largest = edition;
                }
            }
        }
        System.out.println(largest);
    }
}
