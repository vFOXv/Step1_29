package com.company.JavaLesson4;

import java.util.Scanner;

public class JavaLesson4 {
    public static void main(String[] args) {
//        System.out.println("Введите чило от 0 до 999.");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        int numberAdd;
//
//        numberAdd = number / 100;
//        if (numberAdd != 0) {
//            System.out.println("Цифр в числе 3");
//        } else {
//            numberAdd = number / 10;
//            if (numberAdd != 0) {
//                System.out.println("Цифр в числе 2");
//            } else {
//                System.out.println("Цифр в числе 1");
//            }
//        }
//
//        numberAdd = Math.abs(number);
//        if (numberAdd == number) {
//            System.out.println("Число положительное.");
//        } else {
//            System.out.println("Число отрицательное");
//
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        double number = scanner.nextDouble();
        for(int i = 0; i < 10; i++){
            System.out.print(number + " ");
        }
    }
}
