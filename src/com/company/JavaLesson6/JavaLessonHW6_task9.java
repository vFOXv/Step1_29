package com.company.JavaLesson6;

public class JavaLessonHW6_task9 {
    public static void main(String[] args) {
        //Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от -10 до 10.
        // Вывести массив на экран. Найти наименьшее значение и его индекс. 
        int min = 10;
        int index = 0;

        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int)(-10+ (Math.random()*20));
            System.out.print(array[i] + " ");
            if(min > array[i]){
                min = array[i];
                index = i;
            }
        }
        System.out.println();
        System.out.println("Min this array = "+min+". Its index "+index+".");
    }
}
