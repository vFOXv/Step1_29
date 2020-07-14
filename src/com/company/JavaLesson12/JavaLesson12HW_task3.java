package com.company.JavaLesson12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaLesson12HW_task3 {
    //**Пользователь вводит текст, в котором имеются несколько идущих подряд цифр.
    //        Написать метод, который получает число, образованное этими цифрами (сделать проверку на
    //        наличие цифр в тексте, вывести первые идущие подряд цифры, остальные не нужно).
    static String myString = null;
    static int number = 0;

    public static String scanner() {
        System.out.println("Enter string: ");
        Scanner scanner = new Scanner(System.in);
        myString = scanner.nextLine();
        return myString;
    }

    public static int search(String myString) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(myString);
        if (matcher.find()) {
            System.out.println(matcher.group());
        } else {
            System.err.println("This string hasn't numbers!");
        }
        return number;
    }

    public static void main(String[] args) {
        scanner();
        search(myString);
    }
}
