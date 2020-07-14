package com.company.JavaLesson6;

public class JavaLessonHW6_task8 {
    public static void main(String[] args) {
        //Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 10 до 100.
        // Вывести массив на экран. Вывести сумму всех элементов массива. 
        int sum = 0;

        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (10 + Math.random() * 100);
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println();
        System.out.println("Sum of all array numbers = " + sum);
    }
}
