package com.company.JavaLesson6;

public class JavaLessonHW6_task12 {
    public static void main(String[] args) {
        //12. Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 0 до 10.
        // Вывести массив на экран. Вывести сколько раз в массиве встречается число 5. 
        int fiveNumber = 0;
        int index[] = new int[10];


        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (-10 + Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Its indexs: ");

        for (int i = 0; i < 10; i++) {
            if (array[i] == 5) {
                index[fiveNumber] = i;
                fiveNumber++;
                System.out.print(index[fiveNumber - 1] + ", ");
            }
        }
        System.out.println();
        System.out.println("Quantity _5_ number = " + fiveNumber);
    }
}
