package lesson5;

import java.util.Scanner;

public class SkannerUtil {
    /**
     * 1 - модификатор доступа (public/private/protected/______)
     * (слово определяющее видимость данного метода )
     * public - видимость внутри всего проекта
     * private - видимость внутри текущего класса
     * protected - видимость внутри текущего класса и его наследника (его дочерниего класса)
     * ______ - пакетная видимость ( видимость внутри текущей папки)
     * <p>
     * 2 - snanic (пишется или нет)
     * static - общий метод, вызывается у названия класса
     * если static отсутсвует, то данный метотд вызывается у определенного объекта
     * <p>
     * 3 - возврощаемый тип ( или слово void если такого нет )
     * <p>
     * 4 - это название метода с маленькой буквы
     * <p>
     * 5 - входящие параметры ( в круглых скобках через запятую с указанием типа и названия переменной)
     * <p>
     * 6 - тело метода (то что будет происходить при вызове данного метода)
     */
    public static String getLevel() {
        System.out.println("Выберите уровень ");
        System.out.println("Новичок");
        System.out.println("Любитель");
        System.out.println("Профессионал");
        System.out.println("Особый");
        //формула создания любого ссылочного типа
        Scanner scanner = new Scanner(System.in);
        String level = scanner.next();
        return level;
    }

    public static void printField(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void printFigurs() {
        System.out.println("Выберите фигуру");
        System.out.println("1 - круг");
        System.out.println("2 - овал");
        System.out.println("3 - Прямоугольник");
        System.out.println("4 - Треугольник");
        System.out.println("5 - Квадрат");
        System.out.println("6 - Трапеция");

    }

    public static String getInputFigur() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввидите фигуру: ");
        String input = scanner.next();



        return input;
    }


    public static String getAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("площадь и периметр: ");
        String input = scanner.next();
        if (input.equalsIgnoreCase("площадь")
                || input.equalsIgnoreCase("периметр")) {

            return input;
        } else {
            System.out.println("неверный ввод повторите");
            return getAction();
        }
    }

    public static int getParametr(String messgwToUser) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(messgwToUser);
        String input = scanner.next();
        if (isNumeric(input)) {
            if(Integer.parseInt(input) <= 0){
                System.out.println("Введите повторно любое число > 0");
                return getParametr(messgwToUser);
            }else {
                return Integer.parseInt(input);
            }
        }
        else {
            System.out.println("Вы ввели не число!!! Повторите");

            return getParametr(messgwToUser);
        }
    }

    public static boolean isNumeric(String str) {

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }


   public static void logic()

    {
        String figura = SkannerUtil.getInputFigur();

        {
            if (figura.equals("1") || figura.equalsIgnoreCase("круг"))
            {
                MathUtils.circle();

            }
            else if (figura.equals("2") || figura.equalsIgnoreCase("овал")){
                MathUtils.oval();
            }

            else if (figura.equals("3") || figura.equalsIgnoreCase("прямоугольник")){
                MathUtils.rectangle();
            }


           else if (figura.equals("4") || figura.equalsIgnoreCase("треугольник")){
                MathUtils.triangle();
            }

           else if (figura.equals("5") || figura.equalsIgnoreCase("квадрат")) {
                MathUtils.square();
            }

            else if (figura.equals("6") || figura.equalsIgnoreCase("трапеция")) {
                MathUtils.trapezoid();
            }
            else {
                System.out.println("такой фигуры нет");

            }
        }
    }

}


