package com.company.JavaLesson6;

public class JavaLessonHW6_task13 {
    public static void main(String[] args) {
        //13. Создать массив на 10 элементов. Заполнить его случайными числами в диапазоне от 0 до 20.
        // Создать копию первого массива. Вывести оба массива на экран. Увеличить все элементы второго массива в 2 раза.
        // Вывести оба массива на экран. (Ожидаемый результат: только элементы второго массива должны быть изменены) 
        int array[] = new int[10];
        int arrayCopy[] = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        for (int i = 0; i < 10; i++) {
            arrayCopy[i] = array[i];
        }
        System.out.println("First array");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Copy array");
        for (int i : arrayCopy) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("First array");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("In copy array increase elements double");
        for (int i = 0; i < 10; i++) {
            arrayCopy[i] *=2;
            System.out.print(arrayCopy[i] + " ");
        }

    }
}
