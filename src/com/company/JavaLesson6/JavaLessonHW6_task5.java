package com.company.JavaLesson6;

public class JavaLessonHW6_task5 {
    public static void main(String[] args) {
        //5. Дан массив: 
        //1. Все его элементы увеличить в два раза. 
        //2. Умножить все элементы на последний элемент. 

        // array create  and it fill
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + " ");
        }

        int endElement = array[array.length - 1];
        System.out.println();

        //array's elements multiply on two
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //array's elements multiply on the end array's element
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * endElement;
            System.out.print(array[i] + " ");
        }
    }
}
