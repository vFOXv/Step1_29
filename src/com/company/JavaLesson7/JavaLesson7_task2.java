package com.company.JavaLesson7;

import java.util.Scanner;

public class JavaLesson7_task2 {
    public static void main(String[] args) {
        //Задание2: Подсчитать среднюю длину слова во введённом с клавиатуры предложении.
        // * Дробную часть при выводе отбросить.
        // *
        // * Пример:
        // * Для входной строки "Hello World"
        // * Результат будет 5
        int lengthWorld = 0;
        int iteration = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("You must write string: ");
        String strScanner = scanner.nextLine();

        String stringArray[] = strScanner.split(" ");
        System.out.println("Array's length (quantity words) = " + stringArray.length);

        while (iteration < stringArray.length) {
            String stringBuff = stringArray[iteration];
            lengthWorld += stringBuff.length();
//            char buff[] = new char[stringBuff.length()];
//            stringArray[iteration].getChars(0, stringBuff.length(), buff, 0);
            iteration++;
        }
        System.out.println("Average length worlds = " + (int)(lengthWorld/iteration));
    }
}
