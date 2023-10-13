package lesson12;

import java.util.Comparator;
import java.util.TreeSet;

public class SortButtons {

    public void sortByDiametrFromTo(TreeSet<Coin> coins) {
        TreeSet<Coin> forSorting = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {

                if(o1.getDiametr() != o2.getDiametr()){
                    return Double.compare(o1.getDiametr(),o2.getDiametr());
                }
                if (o1.getNominal() != o2.getNominal()){
                    return o1.getNominal() - o2.getNominal();
                }

                if(o1.getYear() != o2.getYear()) {
                    return o1.getYear() - o2.getYear();
                }
                if(!o1.getMatall().equals(o2.getMatall())){
                    return o1.getMatall().compareTo(o2.getMatall());
                }
                return 0;
            }
        });
        forSorting.addAll(coins);

        for (Coin c: forSorting){
            System.out.println(c);
        }
    }

    public void sortByDiametrToFrom(TreeSet<Coin> coins) {
        TreeSet<Coin> forSorting = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {

                if(o1.getDiametr() != o2.getDiametr()){
                    return Double.compare(o2.getDiametr(),o1.getDiametr());
                }
                if (o2.getNominal() != o1.getNominal()){
                    return o1.getNominal() - o2.getNominal();
                }

                if(o1.getYear() != o2.getYear()) {
                    return o2.getYear() - o1.getYear();
                }
                if(!o1.getMatall().equals(o2.getMatall())){
                    return o2.getMatall().compareTo(o1.getMatall());
                }
                return 0;
            }
        });
        forSorting.addAll(coins);

        for (Coin c: forSorting){
            System.out.println(c);
        }
    }

    public void sortByMetallFromTo(TreeSet<Coin> coins) {

    }

    public void sortByMetallToFrom(TreeSet<Coin> coins) {
    }
}