package com.company.JavaLesson5;

import java.util.Scanner;

public class JavaHW5_task4 {
    public static void main(String[] args) {
        // Напечатать таблицу умножения на число n (значение n вводится с клавиатуры 1 <= n <= 9) 
        System.out.println("Enter number from 1 to 9");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number <=0) {
                System.out.println("You write number less 1");
            } else if (number > 9) {
                System.out.println("You write number more 9");
            }
            if (number >= 1 && number <= 9) {
                for (int i = 0; i < 9; i++) {
                    System.out.println(i + 1 + "*" + number + " = " + (i + 1) * number);
                }
            }
        }
     else{
        System.out.println("You write no number");
    }
}
}
