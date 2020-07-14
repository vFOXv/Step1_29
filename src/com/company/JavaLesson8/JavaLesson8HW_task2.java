package com.company.JavaLesson8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaLesson8HW_task2 {
    public static void main(String[] args) {
        //* Задание: Пользователь вводит с клавиатуры строку. Поменять все большие буквы на
        // * маленькие, а маленькие на большие.
        // *
        // * Пример:
        // * При введенной строке: iTsTEP
        // * Вывод на консоль должен быть: ItStep
        int start = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inter string : ");
        String string = scanner.nextLine();

        char charMyString[] = new char[string.length() ];
        string.getChars(0, string.length(), charMyString, 0);

        Pattern patternBig = Pattern.compile("[A-ZА-Я]");
        Matcher matcher = patternBig.matcher(string);

        String newArrayString[] = new String[string.length()];

        while (matcher.find()) {
            start = matcher.start();
            newArrayString[start] = String.valueOf(charMyString[start]).toLowerCase();
        }

        Pattern patternSmall = Pattern.compile("[a-zа-я]");
        matcher = patternSmall.matcher(string);

        while(matcher.find()){
            start = matcher.start();
            newArrayString[start] = String.valueOf(charMyString[start]).toUpperCase();
        }

        for (int i = 0; i < newArrayString.length; i++) {
            if(newArrayString[i] == null){
                newArrayString[i] = " ";
            }
        }

        String newSrting = String.valueOf(newArrayString);
        //System.out.println(newSrting);
        for (String s : newArrayString) {
            System.out.print(s);
        }
        scanner.close();
    }
}
