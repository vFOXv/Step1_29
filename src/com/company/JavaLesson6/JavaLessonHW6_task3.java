package com.company.JavaLesson6;

public class JavaLessonHW6_task3 {
    public static void main(String[] args) {
        //Создать массив целых чисел на 4 элемента. Заполнить его значениями от 10 до 20.
        // Поменять местами первый и последний элемент, а так же второй и третий.
        int safe = 0;

        int[] array = {10, 14, 16, 20};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        safe = array[0];
        array[0] = array[3];
        array[3] = safe;
        safe = array[1];
        array[1] = array[2];
        array[2] = safe;
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
