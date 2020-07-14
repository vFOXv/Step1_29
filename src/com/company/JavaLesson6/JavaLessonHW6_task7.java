package com.company.JavaLesson6;

public class JavaLessonHW6_task7 {
    public static void main(String[] args) {
        //Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 0 до 10
        // Вывести на экран массив в обратном порядке. 
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
