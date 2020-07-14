package com.company.JavaLesson5;

public class JavaHW5_task6 {
    public static void main(String[] args) {
        /* Используя цикл while необходимо вывести на экран следующую последовательность чисел: 
            1 2 4 8 16 32 64 128 256 512 */
        double number = 0.5;

        //System.out.print(1+" ");
        while (number < 512) {
            number = number * 2;
            System.out.print((int)number + " ");
        }
    }
}
