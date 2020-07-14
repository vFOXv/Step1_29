package com.company.JavaLesson11;

import java.util.Scanner;

public class JavaLesson11HW_task1 {
    //*Разложение на множители с помощью рекурсии.
    //* Разложить целое число n > 1 на простые множители.
    //* Вывести в консоль через пробел все множители в порядке возрастания.
    //* Написать рекурсивный метод для вычисления простых множителей.
    //*          Пример:
    //*          132
    //*
    //*  Вывод на консоль:
    //*           2 2 3 11
    static int number = 0;
    static int multiplier = 2; // множитель числа

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

    public static int numberExpansion(int number) {
        if (number == 1) {
            return 1;
        }
        if ((double)number / (multiplier) % 1 == 0){
            number = number / (multiplier);
        System.out.print(multiplier+ " ");
        }else{
            multiplier++;
        }
        return numberExpansion(number);
    }

    public static void main(String[] args) {
        scan();
        numberExpansion(number);
    }
}
