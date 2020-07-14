package com.company.JavaLesson4;

import java.util.Scanner;

public class JavaHW_4_task6 {
    public static void main(String[] args) {
        // Напечатать таблицу перевода 1, 2 ... 20 долларов США в гривны по текущему курсу (значение курса вводится с клавиатуры).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, write course $");
        double course = scanner.nextDouble();
        int reiteration = 1;
        while (reiteration <= 20) {
            System.out.println(reiteration + " $ = " + "\t" + Math.floor( reiteration * course * 100) / 100 + " UAH");
            reiteration++;
        }
        scanner.close();
    }
}
