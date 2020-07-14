package com.company.JavaLesson6;

public class JavaLessonHW6_task4 {
    public static void main(String[] args) {
        // Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 10 до 50.
        // Вывести его значения на экран. 
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 + Math.random() * 40);
            System.out.print(array[i] + " ");
        }
    }
}
