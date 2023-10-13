package lesson3;

public class HomeWork7 {
    public static void main(String[] args) {

        char[] a = {'q','w','e','r'};
        char[] b = {'a','b','c','d'};
        char[] c = new char[a.length + b.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }
        for (int i = 0; i < c.length; i++)
            System.out.print(c[i] + " ");


    }
}
