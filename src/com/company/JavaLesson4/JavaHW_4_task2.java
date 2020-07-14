package com.company.JavaLesson4;

import java.util.Scanner;

public class JavaHW_4_task2 {
    public static void main(String[] args) {
        // Составить программу вывода любое числа любое заданное число раз (запросить у пользователя) в виде, аналогичному выше
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число");
        double number = scanner.nextDouble();
        for(int i = 0; i < 10; i++){
            System.out.print(number + " ");
        }
        scanner.close();
    }
}
