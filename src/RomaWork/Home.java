package RomaWork;

import java.lang.Math.*;
import java.util.Arrays;

public class Home {

    public static void buildingTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double s = p * (p - a) * (p - b) * (p - c);
        s = Math.sqrt(s);
        if (a >= 0.5 && b >= 0.5 && c >= 0.5) {
            System.out.println("Нормальный треугольник. Площадь " + s + " см² ");
        } else {
            System.out.println("Это не нормальный треугольник. Площадь "
                    + s + " см². Введите нормальные размеры в сантиметрах!");
        }
    }


    public static void monthsSelect(int monthsNum) {
        String[] months = {" ", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        for (int i = 1; i < months.length; i++) {
        }
        System.out.println("Вы ввели " + monthsNum + " месяц это - " + months[monthsNum]);
        {
            System.out.println("месяцев всего 12 ");
        }
    }

    public static void randomNumber(int[] numbersR) {

        for (int i = 0; i < numbersR.length; i++) {
            numbersR[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Рондомно заполненный массив на " +
                numbersR.length + " чисел " +
                Arrays.toString(numbersR));
    }


    public static void minNumbers(int[] numbers1) {
        int res = 0;
        for (int i = 0; i < numbers1.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers1.length; j++) {

                if (numbers1[i] <= numbers1[j]) {
                    res = numbers1[i];
                    count++;
                    if (count == numbers1.length) {
                        System.out.println("Минимальное число " + res);
                    } else {
                    }
                } else {
                }
            }
        }
    }

    public static void evenNumbers(int[][] numbers) {
        int res = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (numbers[i][j] % 2 == 0) {
                    res = res + 1;
                }
            }
        }
        System.out.println("Количество чётных чисел " + res);
    }


}        
           
               
            
           
  

