package com.company.JavaLesson12;

import java.util.Scanner;

public class Regulirka {
    public static void main(String[] args) {
        //Пароль должен содержать мшт 2 цифры, мин 1 заглавную букву, мин 1 прописную, и может содержать спецсимволы
        // и иметь длину мин 8 символов
        String password;

        System.out.println("Введите пароль");
        Scanner scanner = new Scanner(System.in);
        password = scanner.nextLine();
        //$ конец строки
        if (password.matches("(?=\\d{2,})(?=.+[a-z])(?=.+[A-Z])(?=.*[!^&?:;-_'/%#])[A-Za-z0-9!^&?:;-_'/%#].{8,}$")){
            System.out.println("Вы ввели валидный пароль");
        } else {
            System.out.println("Ваш пароль не валидный");
        }
    }
}
