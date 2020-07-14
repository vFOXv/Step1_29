package com.company.JavaLesson9;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class JavaLesson9HW_task2 {
    public static void main(String[] args) {
        // * Задание2.Создать квадратный массив размерностью NxN заполненный случайными числами,
        // * вывести массив на экран в виде таблицы, найти наименьший и наибольший элемент
        // * массива и вывести их на экран (если найдено несколько одинаковых элементов —
        // * вывести через запятую индексы строки и столбца, где есть повторения). Вывести на экран
        // * время выполнения поиска, в миллисекундах. Размерность массива должна
        // * задаваться с клавиатуры.
        int size = 0;
        int min = 101;
        int max = -101;
        int iteration = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array");
        //Enter size array
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else {
            if (!scanner.hasNextInt()) {
                System.err.println("You enter not integer! Repeat enter!");
                while (true) {
                    scanner = new Scanner(System.in);
                    if (scanner.hasNextInt()) {
                        size = scanner.nextInt();
                    } else {
                        System.err.println("You enter not integer! Repeat enter!");
                    }
                }
            }
        }
        //Array completed random numbers
        int array[][] = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(200) - 100;
            }
        }
        // Array print out on the screen
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        double start = System.nanoTime();
        //Search min and max values
        int arraySafe[][] = new int[2][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        //Recur positions
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (min == array[i][j]) {
                    arraySafe[0][iteration] = i;
                    arraySafe[1][iteration] = j;
                    iteration++;
                }
            }
        }
        if (iteration > 1) {
            System.out.println("Совпадения min значений по индехам: ");
            for (int i = 0; i < iteration; i++) {
                System.out.print(arraySafe[0][i] + " - " + arraySafe[1][i] + ", ");
            }
        }
        System.out.println();

        //clearing cache
        iteration = 0;
        for (int k = 0; k < size; k++) {
            arraySafe[0][iteration] = 0;
            arraySafe[1][iteration] = 0;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (max == array[i][j]) {
                    arraySafe[0][iteration] = i;
                    arraySafe[1][iteration] = j;
                    iteration++;
                }
            }
        }

        double stop = System.nanoTime();

        if (iteration > 1) {
            System.out.println("Совпадения max значений по индехам");
            for (int i = 0; i < iteration; i++) {
                System.out.print(arraySafe[0][i] + " - " + arraySafe[1][i] + ", ");
            }
        }
        System.out.println("Time spent searching "+(stop-start));
    }
}

