package com.company.JavaLesson7;

import java.util.Scanner;

public class JavaLesson7 {
    public static void main(String[] args) {
        //Запрашивать у пользователя стоки (5 строк). После введения каждой строки вывести размер строки или сообщение «Строка пустая».
        // (не используем условие string.length() == 0).

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            if (string.isEmpty()) {
                System.out.println("String is empty!");
            } else {
                System.out.println("Length this string = " + string.length());
            }
        }
    }
}
