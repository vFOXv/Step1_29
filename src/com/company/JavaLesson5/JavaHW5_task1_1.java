package com.company.JavaLesson5;

import java.util.Scanner;

public class JavaHW5_task1_1 {
    public static void main(String[] args) {
        // Определить количество цифр в введённом числе. 
        int number = 0;
        int rank = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println(" You must write number");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            do {
                number = number / 10;
                rank++;
            } while (number > 0);
            System.out.println(" Rank this number = " + rank);
        }
        scanner.close();
    }
}
