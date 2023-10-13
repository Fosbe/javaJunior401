package RomaWork;

import  java.lang.Math.*;
  import java.util.Arrays;


public class Main2{
   public static void main(String[] args) {
   int[][]numbers = {{18,12,14},{13,24,25},{18,10,2}};
   int[]numbers1 = {5,4,-3,2,1};
   int[]numbersR = new int[16];
   int monthsNum = 13;
   double a; double b; double c;


   Home home = new Home();
   home.evenNumbers(numbers);
   home.minNumbers(numbers1);
   home.randomNumber(numbersR);
   home.monthsSelect(monthsNum);
   Home.buildingTriangle(0.5,0.5,0.5);
   }
}