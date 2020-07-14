package com.company.JavaLesson10;

import java.util.Random;
import java.util.Scanner;

public class JavaLesson10HW_task1 {
    //Написать метод, определяющую среднее арифметическое элементов передаваемого ей массива.

    static int size = 0;


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

    public static double average(int array[]) {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = array[i] + sum;
        }
        average = (double) sum/size;
        return average;
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
        System.out.println(average(array));
    }
}
