package com.company.JavaLesson10;

import java.util.Random;
import java.util.Scanner;

public class JavaLesson10Hw_task2 {
    //Написать функцию, определяющую минимум и максимум (значение и номер)
    //элементов передаваемого ей массива.
    static int size = 0;
    static int min = 101;
    static int max = -101;
    static int index = 0;


    public static int scan() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of size this array");
        if (scanner.hasNextInt()) {
            size = scanner.nextInt();
        } else {
            System.err.println("You enter not integer! Repeat enter!");
            while (true) {
                scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    size = scanner.nextInt();
                    break;
                } else {
                    System.err.println("You enter not integer! Repeat enter!");
                }
            }
        }
        scanner.close();
        return size;
    }

    public static void value(int array[]) {
        //Search min and max values
        for (int i = 0; i < size; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("MIN = " + min);
        System.out.println("MAX = " + max);
    }

    public static void index(int array[]) {
        //Recur positions
        int iteration = 0;
        int arraySafe[] = new int[size];
        for (int i = 0; i < size; i++) {
            if (min == array[i]) {
                arraySafe[iteration] = i;
                iteration++;
            }

        }
        if (iteration > 1) {
            System.out.println("Совпадения min значений по индехам: ");
            for (int i = 0; i < iteration; i++) {
                System.out.print(arraySafe[i] + ", ");
            }
        }
        System.out.println();

        //clearing cache
        iteration = 0;
        for (int k = 0; k < size; k++) {
            arraySafe[k] = 0;
        }

        for (int i = 0; i < size; i++) {

            if (max == array[i]) {
                arraySafe[iteration] = i;
                iteration++;
            }
        }

        if (iteration > 1) {
            System.out.println("Совпадения max значений по индехам");
            for (int i = 0; i < iteration; i++) {
                System.out.print(arraySafe[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {

        scan();

        Random random = new Random();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(200) - 100;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        value(array);
        index(array);

    }
}
