package com.company.JavaLesson9;

import java.util.Random;
import java.util.Scanner;

public class JavaLesson9HW_task1 {
    public static void main(String[] args) {
        //*Здание1. Заполните двухмерный массив размерностью NxM случайными числами и построчно перенесите эти
        // * числа в одномерный массив. Вывести исходный массив и полученный масcивы.
        int line = 0;
        int column = 0;
        int iteration = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of line this array");


        if (scanner.hasNextInt()) {
            line = scanner.nextInt();
        } else {
            System.err.println("You enter not integer! Repeat enter!");
            while (true) {
                scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    line = scanner.nextInt();
                    break;
                } else {
                    System.err.println("You enter not integer! Repeat enter!");
                }
            }
        }

        System.out.println("Enter number of columns");

        if (scanner.hasNextInt()) {
            column = scanner.nextInt();
        } else {
            System.err.println("You enter not integer! Repeat enter!");
            while (true) {
                scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    column = scanner.nextInt();
                    break;
                } else {
                    System.err.println("You enter not integer! Repeat enter!");
                }
            }
        }

        int array[][] = new int[line][column];

        Random random = new Random();

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = random.nextInt(200) - 100;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();

        int arrayPrimitive[] = new int[line * column];

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                arrayPrimitive[iteration] = array[i][j];
                iteration++;
            }
        }
        for (int i1 : arrayPrimitive) {
            System.out.print(i1 + " ");
        }

    }
}

