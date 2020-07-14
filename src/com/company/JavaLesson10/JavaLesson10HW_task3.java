package com.company.JavaLesson10;

import java.util.Scanner;

public class JavaLesson10HW_task3 {
    //Число называется совершенным, если сумма всех его делителей равна ему самому.
    //Напишите функцию поиска таких чисел во введенном интервале.

    static int number = 0;

    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of size this array");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            System.err.println("You enter not integer! Repeat enter!");
            while (true) {
                scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    number = scanner.nextInt();
                    break;
                } else {
                    System.err.println("You enter not integer! Repeat enter!");
                }
            }
        }
        scanner.close();
        return number;
    }

    public static void perfect(int number) {
        //int array[] = new int[number];
        //int iter = 0;
        int cache = 0;
        for (int i = 1; i < number; i++) {
            if ((double) number % i == 0) {
                cache = i + cache;
            }
        }
        if (number == cache) {
            System.out.println("Number " + number + " is perfect");
        } else {
            System.out.println("Number " + number + " is not perfect");
        }
    }


    public static void main(String[] args) {
        scan();
        perfect(number);
    }
}
