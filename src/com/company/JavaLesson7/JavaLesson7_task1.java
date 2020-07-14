package com.company.JavaLesson7;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class JavaLesson7_task1 {
    public static void main(String[] args) {
        //* Задание1: Ввести с клавиатуры строку текста, а затем один символ. Показать на экран
        // * индексы (через пробел) и количество совпадений на следующей строке (ищем вхождения символа в строку).

        // * Если символ не найдет - выводить -1

        // * Примечание: использовать методы строк

        // * Пример:
        // * Для строки "обороноспособность" и введенного символа "o" вывод будет:
        // * 0 2 4 6 9 11 14
        // * 7
        int index = 0;
        int quantity = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("You must write string:");
        String str = scanner.nextLine();
        System.out.println("You must write symbol: ");
        String myChar = scanner.nextLine();

        System.out.print(str + "\t");
        System.out.println(myChar);

        if (str.contains(myChar)) {
            index = str.indexOf(myChar);
            System.out.print(index + " ");
            while (index < str.length() && index != -1) {
                index = str.indexOf(myChar, index += 1);
                quantity++;
                if(index >= 0){
                System.out.print(index + " ");
                }
            }
            System.out.println();
            System.out.println(quantity);
        } else {
            System.err.println(str.indexOf(myChar));
        }
        scanner.close();
    }
}
