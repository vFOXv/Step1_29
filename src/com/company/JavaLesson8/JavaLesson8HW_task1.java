package com.company.JavaLesson8;

import java.util.Scanner;

public class JavaLesson8HW_task1 {
    public static void main(String[] args) {
        //Задание: С помощью регулярных выражений напишите проверку ввода номера мобильного телефона
        // * Пример:
        // * +380(99)123-45-67
        // * Номер валидный
        //        \+\d{3}\(\d{2}\)\d{3}\-\d{2}\-\d{2}
        boolean result = false;

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inter telephone's number in format +380(99)123-45-67 ");
            String phoneNumber = scanner.nextLine();

            result = phoneNumber.matches("\\+\\d{3}\\(\\d{2}\\)\\d{3}\\-\\d{2}\\-\\d{2}");

            if (result) {
                System.out.println("Phone's number is valid :)");
                break;
            } else {
                System.out.println("Phone's number is not valid :( ");
                System.out.println("Inter telephone's number in format +380(99)123-45-67 ");
            }
            scanner.close();
        }
    }
}
