package com.company.JavaLesson6;

public class JavaLessonHW6_task6 {
    public static void main(String[] args) {
        //Создать массив целых чисел на 10 элементов. Заполнить его случайными числами в диапазоне от 0 до 10.
        // Вывести массив на экран. Найти наибольшее значение и его индекс. 
        int max = 0;
        int index = 0;

        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("Max value = " + max + "Its index = " + index);

    }
}
