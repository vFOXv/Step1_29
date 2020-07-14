package com.company.JavaLesson4;

import java.util.Scanner;

public class JavaHW_4_task4 {
    public static void main(String[] args) {
        // Напечатать в консоли треугольник используя символ +.
        Scanner scanner = new Scanner(System.in);
        System.out.println("You must wirte size triangle");
        int size = scanner.nextInt();

        for (int i = 0; i <= size; i++) {
            for (int middle = 0; middle <= (size - i) / 2; middle++) {
                System.out.print(' ');
            }
            for (int j = 0; j <= i; j++) {
                System.out.print('+');
            }
            System.out.println();
        }
        scanner.close();
    }

}
