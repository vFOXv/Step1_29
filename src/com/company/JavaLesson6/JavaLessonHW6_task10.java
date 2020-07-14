package com.company.JavaLesson6;

public class JavaLessonHW6_task10 {
    public static void main(String[] args) {
        //Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от -10 до 10.
        // Вывести массив на экран. Вывести количество отрицательных чисел в массиве и их индексы.  
        //Например:  
        //Количество отрицательных чисел: 5 
        //Индексы чисел в массиве: 3, 6, 9. 
        int negativeNumber = 0;
        int index[] = new int[10];


        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (-10 + Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Its indexs: ");

        for (int i = 0; i < 10; i++) {
            if (array[i] < 0) {
                index[negativeNumber] = i;
                negativeNumber++;
                System.out.print(index[negativeNumber - 1] + ", ");
            }
        }
        System.out.println();
        System.out.println("Quantity negative number = " + negativeNumber);
    }
}
