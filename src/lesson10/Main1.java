package lesson10;

import test.IMatrix;

public class Main1 {
    public static void main(String[] args) {
        double[][] forA = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                          {9, 10, 11, 12}};

        double[][] forb = {{5, 3, 7, 2},
                           {8, 2, 4,9},
                           {9, 1, 2, 7}};

        Matrix a = new Matrix(forA);
        Matrix b = new Matrix(forb);

        IMatrix resultAdd = a.add(b);
        resultAdd.printToConsole();

    }
}
