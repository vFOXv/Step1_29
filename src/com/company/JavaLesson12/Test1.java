package com.company.JavaLesson12;

import java.util.Scanner;

public class Test1 {
    static String myString = null;

    public static String scan() {
        Scanner scan = new Scanner(System.in);
        myString = scan.nextLine();
        return myString;
    }

    public static void valid(String myString) {
        char crA = 'A';
        char crZ = 'Z';
        char cra = 'a';
        char chz = 'z';
        char ch0 = '0';
        char ch9 = '9';
        char myChar = 0;
        int letter = 0;
        int number = 0;
        int other = 0;


        for (int i = 0; i < myString.length(); i++) {
            myChar = myString.charAt(i);
            if (myChar <= crZ && myChar >= crA || myChar >= cra && myChar <= chz) {
                letter++;
            } else if (myChar <= ch9 && myChar >= ch0) {
                number++;
            } else {
                other++;
                break;
            }
        }

        if (number + letter < 8 || other != 0 || number < 2) {
            System.out.println(" password is not valid");
        } else {
            System.out.println(" password is  valid");
        }
    }


    public static void main(String[] args) {
        valid(scan());
    }
}
