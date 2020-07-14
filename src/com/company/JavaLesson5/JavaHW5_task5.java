package com.company.JavaLesson5;

public class JavaHW5_task5 {
    public static void main(String[] args) {
        /*5. Используя цикл while необходимо вывести на экран следующую последовательность чисел:  
        7 14 21 28 35 42 49 56 63 70 77 84 91 98. */
        int number = 0;
        int i = 1;

        while (number < 98) {
            number = i++ * 7;
            System.out.print(number+ " ");
        }
    }
}
