package com.company.JavaLesson3;

import java.util.Random;
import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int iterance = 1;
        int guessNumber = -1;
        int randonNumber = random.nextInt(101);


        while(iterance < 8 &&  guessNumber != randonNumber) {

            System.out.println("You must write integer number from 0 to 100. Iterance = " + iterance);


            guessNumber = scanner.nextInt();


            if (guessNumber == randonNumber) {
                System.out.println("You guess the number! Congrats!");
            } else if (guessNumber > randonNumber) {
                System.out.println("Number is big.");
            } else if (guessNumber < randonNumber) {
                System.out.println("Number is little.");
            }else if (iterance == 7){
                System.out.println("You lose. Guess number = " + randonNumber);
            }
            iterance++;
        }


//        for (int iterance = 1; iterance <7; iterance++){
//
//            System.out.println("You must write integer number from 0 to 100. Iterance = " + iterance);
//
//            guessNumber = scanner.nextInt();
//
//            if (guessNumber == randonNumber) {
//                System.out.println("You guess the number! Congrats!");
//                break;
//            } else if (guessNumber > randonNumber) {
//                System.out.println("Number is big.");
//            } else if (guessNumber < randonNumber) {
//                System.out.println("Number is little.");
//            }else if (iterance == 7){
//                System.out.println("You lose. Guess number = " + randonNumber);
//                break;
//            }
//        }

    }
}
