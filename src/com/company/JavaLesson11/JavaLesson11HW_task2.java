package com.company.JavaLesson11;

import java.util.Scanner;

public class JavaLesson11HW_task2 {
    //* Необходимо написать программу, которая бы вычисляла сумму цифр в числе.
    //* Затем в получившемся числе опять вычисляла сумму цифр.
    //* Эти действия необходимо выполнять до тех пор, пока не останется число, состоящее из одной цифры.
    //* Например, если ввести число 555, то, посчитав сумму цифр в нем, получим 5+5+5=15.
    //* Так как получившееся число 15 состоит не из одной цифры, то необходимо посчитать сумму цифр в нем, т.е. 1+5=6.
    //* Теперь было получено число 6, состоящее из одной цифры, значит 6 - это и есть ответ.
    static int number = 0;
    static int cache = 0;
    static int iter = 0;

    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
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

    public static int numberSplitting(int number) {
        if (number % 10 == number) {
            return cache = number + cache;
        }
        if (number % 10 != 0 || number >= 10) {
            cache = (int) (number % 10 + cache);
            number = (int) (number / 10);
        }
        return numberSplitting(number);
    }

    public static int sum(int number) {
        int myCache = 0;

        if (Math.abs(number) < 10) {
            System.out.println("Total number = " + number);
            return number;
        }
        if (Math.abs(number) >= 10) {
            numberSplitting(number);
        }
        System.out.println("Number on iteration № " + (++iter) + " = " + number);
        //clearing cache
        myCache = cache;
        cache = 0;
        return sum(myCache);
    }

    public static void main(String[] args) {
        scan();
        sum(number);
    }
}
