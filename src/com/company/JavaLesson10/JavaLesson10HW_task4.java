package com.company.JavaLesson10;

import java.util.Random;
import java.util.Scanner;

public class JavaLesson10HW_task4 {
    //В функцию передаётся массив случайных чисел в диапазоне от -20 до +20. Необходимо найти позиции крайних отрицательных элементов (самого левого отрицательного элемента и
    //самого правого отрицательного элемента) и отсортировать элементы, находящиеся между ними.
    static int size = 0;
    static int iteration = 0;
    static int negativeLeft = 0;
    static int negativeRight = 0;

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

    public static void random(int array[]) {
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(40) - 20;
        }
        System.out.println("Initial array");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void index(int array[]) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && iteration < 1) {
                negativeLeft = i;
                iteration++;

            }
            if (array[i] < 0 && negativeLeft != i) {
                negativeRight = i;
                iteration++;
            }
        }
        if (iteration <= 1) {
            System.out.println("Array has not two negative numbers!");
        }
    }

    public static void sort(int array[]) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = negativeLeft+1; i < negativeRight - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.println("Sort array");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int array[] = new int[scan()];
        random(array);
        index(array);
        if (iteration > 1) {
            sort(array);
        }
    }
}
