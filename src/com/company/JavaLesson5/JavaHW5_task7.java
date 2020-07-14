package com.company.JavaLesson5;

import java.util.Scanner;

public class JavaHW5_task7 {
    public static void main(String[] args) {
        /* Найти: 
1. Произведение всех чисел от 8 до 15. 
2. Произведение всех чисел от a до 20 (значение a вводится с клавиатуры; 1 <= a <= 20) 
3. Произведение всех чисел от 1 до b (значение b вводится с клавиатуры; 1 <= b <= 20)  */
        int number = 8;
        // part 1
        for (int i = number + 1; i <= 15; i++) {
            number = number * i;
        }
        System.out.println("Product of numbers from 8 to 15 = " + number);
        // part 2

        System.out.println("You mast write integer number from 1 to 20");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();

        int numberSafe = number;

            if (number < 1) {
                System.out.println("Number < 1 !!!");
            } else if (number > 20) {
                System.out.println("Number > 20 !!!");
            } else {
                for (int i = number+1; i <= 20; i++) {
                    number = number*i;
                }
                System.out.println("Product numbers from "+numberSafe+" to 20 =" + number );
            }
        } else {
            System.err.println("This is not integer number");
        }

        // part 3
        System.out.println("You mast write integer number from 1 to 20");
        if (scanner.hasNextInt()) {
            int numberSafe = number;

            number = scanner.nextInt();
            if (number < 1) {
                System.out.println("Number < 1 !!!");
            } else if (number > 20) {
                System.out.println("Number > 20 !!!");
            } else {
                for (int i = number - 1; i > 0; i--) {
                    number = number * i;
                }
            }
            System.out.println("Product numbers from 1 to " + numberSafe + " = " + number);
        } else {
            System.err.println("This is not integer number");
        }
        scanner.close();
    }
}
