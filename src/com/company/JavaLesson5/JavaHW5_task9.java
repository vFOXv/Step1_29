package com.company.JavaLesson5;

import java.util.Scanner;

public class JavaHW5_task9 {
    public static void main(String[] args) {
        // Запросить у пользователя натуральное число n. Вывести в консоль все его цифры через пробел.
        int rank = 0;
        int iterate = 1;
        int number = 0;
        int numberSafe = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("You must write nature number");

        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            numberSafe = number;

            do {
                number = Math.abs(number) / 10;
                rank++;
            } while (number > 0);
            System.out.println("This number has " + rank + " rank.");
            while (iterate <= rank) {
                System.out.print((int) (Math.abs(numberSafe) / Math.pow(10, (rank - iterate))) % 10 + " ");
                iterate++;
            }
        } else {
            System.err.println("You write not nature number!");
        }
        scanner.close();
    }
}
