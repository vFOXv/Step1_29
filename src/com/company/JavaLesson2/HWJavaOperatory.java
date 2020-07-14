package com.company.JavaLesson2;

import java.util.Scanner;

public class HWJavaOperatory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You must to write number - x");
        double x = scanner.nextDouble();
        char degree = (char)178;
        double y = 7*Math.pow(x,2)-3*x+6;
        System.out.println("y = 7x"+degree+"-3x+6 = " + y);
        //the code finished calculation y (job 1)

        System.out.println("You must to write number - a");
        double a = scanner.nextDouble();
        x = 12*Math.pow(a,2)+7*a-16;
        System.out.println("x = 12a"+degree+" +7a-16= " + x);
        //the code finished calculator x (job 1)

        System.out.println("You must to write size of square's side");
        double side = scanner.nextDouble();
        System.out.println("Perimeter this square = " + side*4);
        // the code finished calculator square's perimeter  (job 2)

        System.out.println("You mast to write size of circle's radius");
        double radius = scanner.nextDouble();
        System.out.println("Diameter this circle = " + radius*2);
        // the code finished calculator circle's diameter (job 3)

        System.out.println("You mast to write both number");
        int bothNumber = scanner.nextInt();
        int secondNumber = bothNumber % 10;
        int ferstNumber = bothNumber - secondNumber;
        System.out.println("dozens/десятки = " + ferstNumber);
        System.out.println("untils/единицы = " + secondNumber);
        System.out.println("sum/сумма цифр числа = " + (ferstNumber + secondNumber));
        System.out.println("multiplication/произведение цифр числа = "+ ferstNumber * secondNumber);
        scanner.close();
        // the code finished calculator (job 4)

        int number;
        int ferstAndSecondNumber;
        int tripleNumber;
        ferstAndSecondNumber = (237 % 100) * 10;
        tripleNumber = (237 - ferstAndSecondNumber/10)/100;
        number = ferstAndSecondNumber + tripleNumber;
        System.out.println("Number x = " + number);
        //the code finished calculator this number (job 5)



        }
}
