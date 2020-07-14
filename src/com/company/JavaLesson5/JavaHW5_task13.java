package com.company.JavaLesson5;

import java.util.Scanner;

public class JavaHW5_task13 {
    public static void main(String[] args) {
      // Дано натуральное число. Определить насколько максимальная цифра превышает минимальную. 
        int number = 0;
        int iterate = 0;
        int min = 9;
        int max = 0;
        int safe = 0;
        int safeEnd = 0;

        System.out.println("You must write min double nature number.");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();

            if (Math.abs(number) >= 10) {

                safe = Math.abs(number);
                min = safe%10;
                do {
                    safe = (int) ((Math.abs(number) / Math.pow(10, iterate)) % 10);
                    iterate++;

                    if (min >= safe && min > max) {
                        max = min;
                        min = safe;
                    } else if (min > safe && min <= max) {
                        min = safe;
                    }else if(min< safe && max < safe){
                        max = safe;
                    }
                    safeEnd = (int) ((Math.abs(number) / Math.pow(10, iterate)));// this is check on finish cycle if there is 0 in number
                } while (safeEnd > 0);
                System.out.println("MIN = " + min);
                System.out.println("MAX = " + max);
                System.out.println("MAX - MIN = "+ (max-min));
            } else {
                System.err.println("You must write min double number!");
            }
        } else {
            System.err.println("You wrote not nature number!");
        }
        scanner.close();
    }
}
