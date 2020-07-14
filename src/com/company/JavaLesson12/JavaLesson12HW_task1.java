package com.company.JavaLesson12;

import java.util.Scanner;

public class JavaLesson12HW_task1 {
    //* Написать метод, который получает слово и определяет одинаковы ли второй и четвертый символы в нем.
    static char array[] = new char[4];

    public static String scan() {
        String myString = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word. It's length is min 4 char:");
        myString = scanner.nextLine();
        if (myString.isEmpty() || myString.length() < 4) {
            while (true) {

                Scanner scan = new Scanner(System.in);

                if (myString.isEmpty()) {
                    System.err.println("You enter empty string!!! Enter must word!");
                    myString = scan.nextLine();
                }
                if (myString.length() < 4 && myString.length() > 0) {
                    while (true) {
                        System.err.println("Word's length must be min 4 char!!! Enter word  min 4 char!");
                        myString = scan.nextLine();
                        break;
                    }
                } else if (myString.length() >= 4)
                    break;
            }
        }
        return myString;
    }

    public static char[] takeChar(String myString) {
        //нужно найти мах 4 символ
        for (int i = 1; i < 4; i += 2) {
            array[i] = myString.charAt(i);
        }
        return array;
    }

    public static boolean check(char array[]) {
        boolean myCheck = false;
        if (array[1] == array[3]) {
            myCheck = true;
            System.out.println(myCheck + "   /" + array[1] + " = " + array[3]);
        } else {
            System.err.println(myCheck);
        }
        return myCheck;
    }

    public static void main(String[] args) {
        takeChar(scan());
        check(array);
    }
}
