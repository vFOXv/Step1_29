package com.company.JavaLesson4;

import java.util.Scanner;

public class JavaHW_4_task10 {
    public static void main(String[] args) {
        /*11.  Вывести на экран ряд чисел Фибоначчи, состоящий из n элементов. Числа Фибоначчи – это элементы числовой
         последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144…       */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну последовательности.");
        int myLong = scanner.nextInt();
        int number = 0;
        int number1 = 1;
        int number2=1;
        System.out.print(0+" "+number1+" "+number2+" ");
        for(int i = 0; i < myLong; i++){
            number = number1+number2;
            System.out.print(number+ " ");
            number1 = number2;
            number2 = number;

        }
    }
}
