package lesson12;

import java.util.Objects;

public class Coin implements Comparable<Coin> {
    private double diametr;
    private String matall;
    private int nominal;
    private int year;

    public Coin() {
    }

    public Coin(double diametr, String matall, int nominal, int year) {
        this.diametr = diametr;
        this.matall = matall;
        this.nominal = nominal;
        this.year = year;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getMatall() {
        return matall;
    }

    public void setMatall(String matall) {
        this.matall = matall;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (Double.compare(diametr, coin.diametr) != 0) return false;
        if (nominal != coin.nominal) return false;
        if (year != coin.year) return false;
        return Objects.equals(matall, coin.matall);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(diametr);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (matall != null ? matall.hashCode() : 0);
        result = 31 * result + nominal;
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return " Монета{ " +
                " Диаметр = " + diametr +
                "  Металл = '" + matall + '\'' +
                "  Номинал ="  + nominal +
                "  Год выпусука = " + year +
                '}';
    }

    @Override
    public int compareTo(Coin o) {
        // this -- это первая монета
        // o --- ссылка на 2 монету
        // сортировка по номиналу
        if (this.nominal != o.nominal){
            return this.nominal - o.nominal;
        }
        if(this.year != o.year) {
            return this.year - o.year;
        }
        if(this.diametr != o.diametr){
            return Double.compare(this.diametr,o.diametr);
        }
        if(!this.matall.equals(o.matall)){
            return this.matall.compareTo(o.matall);
        }
        return 0;
    }
}
