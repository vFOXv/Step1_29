package com.company.JavaLesson7;

import java.util.Scanner;

public class JavaLesson7_task3 {
    public static void main(String[] args) {
        // * Задание3: Ввести строку с клавиатуры. Из введённой строки выбрать все слова
        // * начинающиеся на гласные буквы (e, o, a, u, i или y) и заканчивающиеся на согласные.
        // * Вывести отобранные слова на консоль.

        // yTest   estartsy Argument and tests iF  ery a string estarts with the specified eprefixe beginning a specified index.   whe uhh rhe nha ehe ehf
        int iteration = 0;
        boolean start = false;
        boolean end = false;

        String startChar[] = {"e", "o", "a", "u", "i", "y"};
        String endChar[] = {"q", "w", "r", "t", "p", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string: ");
        String myString = scanner.nextLine();
        String myArray[] = myString.split(" |\\(|'|\\.|_|=|\\+|-|\\|\\)|\\#|\\?|\\@|\\!|\\/|\\,|\\:");

        while (iteration < myArray.length) {
            myString = myArray[iteration];
            myString = myString.toLowerCase();               //spring transfer  in lover case

            for (int i = 0; i < 6; i++) {
                if (myString.startsWith(startChar[i])) {    //check on start word
                    start = true;
                    break;
                }
            }

            if (start == true) {
                for (int j = 0; j < 20; j++) {
                    if (myString.endsWith(endChar[j])) {         //check on end word
                        end = true;
                        break;
                    }
                }
            }

            if (start == true && end == true) {
                System.out.println(myString);
            }
            iteration++;
            start = false;
            end = false;
        }
        scanner.close();
    }
}
