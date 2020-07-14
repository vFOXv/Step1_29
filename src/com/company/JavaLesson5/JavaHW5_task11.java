package com.company.JavaLesson5;

import java.util.Scanner;

public class JavaHW5_task11 {
    public static void main(String[] args) {
        // Дано число n. Из чисел 1, 4, 7, 10, 13, ... (до заданного вами числа)  напечатать те, которые не превышают n. 
        int number = 0;
        int step = -2;

        System.out.println("You must write nature number.");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            while (step < number - 3) {
                System.out.print((step += 3) + " ");
            }
        } else {
            System.err.println("You wrote not nature number!");
        }
        scanner.close();
    }
}
