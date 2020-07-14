package com.company.JavaLesson5;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class JavaHW5_task8 {
    public static void main(String[] args) {
        // Даны натуральные числа x и y. Вычислить произведение x y, используя лишь оператор сложения. 
        int number = 0;
        int number_x = 0;
        int number_y = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("You must write number X");
        if (scanner.hasNextInt()) {
            number_x = scanner.nextInt();
        } else {
            System.err.println("This is ont integer number!");
        }
        System.out.println("You must write number Y");
        if (scanner.hasNextInt()) {
            number_y = scanner.nextInt();
        } else {
            System.err.println("This is ont integer number!");
        }
        for (int i = number_y; i > 0; i--) {
            number = number + number_x;
        }
        System.out.println("Product X and Y = " + number);
        scanner.close();
    }
}
