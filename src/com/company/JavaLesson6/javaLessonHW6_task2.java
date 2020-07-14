package com.company.JavaLesson6;

public class javaLessonHW6_task2 {
    public static void main(String[] args) {
        //Создать массив целых чисел на 20 элементов. Заполнить его значениями от 1 до 20 по возрастающей.
        // Вывести его значения на экран.
        int[] array = new int[20];
        int j = 0;
        for (int i : array) {
            array[i] = j + 1;
            System.out.print(array[i] + " ");
            j++;

        }
    }
}
