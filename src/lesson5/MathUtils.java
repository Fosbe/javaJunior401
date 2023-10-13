package lesson5;

public class MathUtils {


    public static void circle() {

        String action = SkannerUtil.getAction();
        int radius = SkannerUtil.getParametr("введите радиус: ");
        if (action.equalsIgnoreCase("площадь")) {
            System.out.println("площадь: " + 2 * 3.14 * radius);
        } else {
            System.out.println("Периметр круга:" + 3.14 * (radius * radius));
        }
    }


    public static void oval() {


        String action = SkannerUtil.getAction();
        int a = SkannerUtil.getParametr("малый радиус: ");
        int b = SkannerUtil.getParametr("большой радиус: ");
        if (action.equalsIgnoreCase("площадь")) {
            System.out.println("площадь: " + a * b * 3.14);
        } else {
            System.out.println("Периметр круга:" + 4 * ((3.14 * a * b + ((a * a) - (b * b)) / (a + b))));
        }
    }


    public static void rectangle() {


        String action = SkannerUtil.getAction();
        int a = SkannerUtil.getParametr("сторона 'a': ");
        int b = SkannerUtil.getParametr("сторона 'b': ");
        if (action.equalsIgnoreCase("площадь")) {
            System.out.println("площадь: " + a * b);
        } else {
            System.out.println("Периметр круга:" + 2 * (a + b));
        }
    }


    public static void triangle() {


        String action = SkannerUtil.getAction();
        if (action.equalsIgnoreCase("площадь")) {
            int height = SkannerUtil.getParametr(" введите высоту треугольника: ");
            int base = SkannerUtil.getParametr("введите длинну основания: ");
            System.out.println("площадь: " + (height * base) / 2);
        } else {
            int a = SkannerUtil.getParametr("сторона 'a': ");
            int b = SkannerUtil.getParametr("сторона 'b': ");
            int c = SkannerUtil.getParametr("сторона 'с': ");
            System.out.println("Периметр:" + (a + b + c));
        }
    }


    public static void square() {


        String action = SkannerUtil.getAction();
        int a = SkannerUtil.getParametr("сторона 'a': ");
        int b = SkannerUtil.getParametr("сторона 'b': ");
        if (action.equalsIgnoreCase("площадь")) {
            System.out.println("площадь: " + a * b);
        } else {
            System.out.println("Периметр:" + 2 * (a + b));
        }
    }


    public static void trapezoid() {

        String action = SkannerUtil.getAction();
        if (action.equalsIgnoreCase("площадь")) {
            int height = SkannerUtil.getParametr("введите высоту трапеции: ");
            int middleLine = SkannerUtil.getParametr("средняя линия : ");
            System.out.println("площадь: " + middleLine * height);
        } else {
            int a = SkannerUtil.getParametr("сторона 'a': ");
            int b = SkannerUtil.getParametr("сторона 'b': ");
            int c = SkannerUtil.getParametr("сторона 'c': ");
            int d = SkannerUtil.getParametr("сторона 'd': ");
            System.out.println("Периметр:" + (a + b + c + d));

        }
    }


}
