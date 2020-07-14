package com.company.JavaLesson8;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaLesson8HW_task3 {
    public static void main(String[] args) {
        // Задание: Написать программу которая будет подсчитывать количество слов, гласных и
        // * согласных букв в строке введённой пользователем. Дополнительно выводить
        // * количество знаков пунктуации, цифр и др. символов.
        // *
        // * Прмер:
        // * Для введенной строки: "Hello World"
        // * Вывод на консоль будет:
        // * Слов - 2
        // * Гласных - 3
        // * Согласных - 7
        int vowel = 0;
        int consonant = 0;
        int other = 0;
        int word = 0;

        int iteration = 0;
        boolean check = false;

        char vowels[] = {'e', 'o', 'a', 'u', 'i', 'y'};
        char consonants[] = {'q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        char another[] = {' ', '.', ',', '/', '-', '_', '|', '!', '?', '<', '>', '#', '@', '&', '(', ')', '+', '=', ';', '"', '*'};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String string = scanner.nextLine();

        //String arrayWord[] = string.split(" |\\(|'|\\.|\\_|=|\\+|-|\\|\\)|\\#|\\?|\\@|\\!|\\/|\\,|\\:"); //Create array from words

        //При наличии двух раздилителей подрят засчитываеться дополнительное слово!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

//        System.out.println("Words count: " + arrayWord.length);
//        for (String s : arrayWord) {
//            System.out.println(s);
//        }
        StringTokenizer stringWord = new StringTokenizer(string);
        while(stringWord.hasMoreTokens()){
            System.out.println(stringWord.nextToken());
            word++;
        }
        System.out.println("Words count: " + word);
        string = string.toLowerCase(); // spring transfer  in cursive letter

        char arrayChar[] = new char[string.length()];

        //если длина массива менише на 1 чем длина строки, то не помещаеться последний символ строки при переводе ее в масив!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        string.getChars(0, string.length(), arrayChar, 0);

        while (iteration < arrayChar.length) {
            for (int i = 0; i < 6; i++) {
                if (arrayChar[iteration] == vowels[i]) {
                    vowel++;
                    check = true;
                    break;
                }
            }
            if (!check) {
                for (int i = 0; i < 20; i++) {
                    if (arrayChar[iteration] == consonants[i]) {
                        consonant++;
                        check = true;
                        break;
                    }
                }
            }
            if (!check) {
                for (int i = 0; i < 21; i++) {
                    if (arrayChar[iteration] == another[i]) {
                        other++;
                        break;
                    }
                }
            }
            iteration++;
            check = false;
        }
        System.out.println("Letter are vowels " + vowel);
        System.out.println("Letter are consonant " + consonant);
        System.out.println("Another chars are " + other);
    }
}

