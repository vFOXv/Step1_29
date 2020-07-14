package com.company.JavaLesson12;

import java.util.Scanner;

public class JavaLesson12HW_task2 {
    //*Пользователь вводит слово. Сделать проверку на то чтобы слово состояло из четного числа букв.
    // Поменять местами его половины.
    static String str = null;

    public static String scan() {
        String myString = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word. :");
        myString = scanner.nextLine();
        if (myString.isEmpty()) {
            while (true) {
                Scanner scan = new Scanner(System.in);
                if (myString.isEmpty()) {
                    System.err.println("You enter empty string!!! Enter must word!");
                    myString = scan.nextLine();
                } else if (myString.length() > 0)
                    break;
            }
        }
        return myString;
    }

    public static int check(String myString) {
        int myCheck = 0;
        if (((double) str.length() / 2) % 1 == 0) {
            myCheck = str.length() / 2;
            System.out.println("Word has even letter!/четный");
        }
        if (myCheck == 0) {
            System.err.println("Word has odd letter!/нечетный");
        }
        return myCheck;
    }

    public static void change(int myCheck) {
        String myString = null;
        if (myCheck > 0) {
            char array[] = new char[myCheck * 2];
            char arrayCach[] = new char[myCheck * 2];
            str.getChars(0, array.length, array, 0);
            str.getChars(0, arrayCach.length, arrayCach, 0);
            for (int i = 0; i < myCheck; i++) {
                array[i] = arrayCach[i + myCheck];
                array[i + myCheck] = arrayCach[i];
            }
            for (char c : array) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        str = scan();
        change(check(str));
    }
}
