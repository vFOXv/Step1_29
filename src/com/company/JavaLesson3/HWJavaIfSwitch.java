package com.company.JavaLesson3;

import java.util.Random;
import java.util.Scanner;

public class HWJavaIfSwitch {
    public static void main(String[] args) {
        //task 1
        int balance;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You must to write integer number.");
        int number = scanner.nextInt();
        balance = number % 2;
        if (balance == 0) {
            System.out.println("This number is even.");
        } else {
            System.out.println("This number is not even.");
        }
        // the code finished calculator even or not even number

        //task 2
        System.out.println("You must writ two integer numbers.");

        double numberFirst = scanner.nextDouble();
        double numberSecond = scanner.nextDouble();

        System.out.println("You must to select operation.");
        System.out.println("1  +");
        System.out.println("2  -");
        System.out.println("3  *");
        System.out.println("4  /");

        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Your result is " + (numberFirst + numberSecond));
                break;
            case 2:
                System.out.println("Your result is " + (numberFirst - numberSecond));
                break;
            case 3:
                System.out.println("Your result is " + numberFirst * numberSecond);
                break;
            case 4:
                if (numberSecond != 0) {
                    System.out.println("Your result is " + numberFirst / numberSecond);
                } else {
                    System.out.println("I don't divide on the zero!!!");
                    break;
                }
            default:
                System.out.println("I don't make this operation!");
        }

        //task 3
        int a = 148;
        int b = 201;
        int c = 200;
        int temporary;

        if (b > c) {
            temporary = c;
            c = b;
            b = temporary;
        }
        if (a > b) {
            temporary = b;
            b = a;
            a = temporary;
        }
        if (b > c) {
            temporary = c;
            c = b;
            b = temporary;
        }

        System.out.println("sequence " + a + " " + b + " " + c);

        //task 4

        Random random = new Random();
        // variable "number" was initialized before in the task 1
        number =100 + random.nextInt(900);
        System.out.println("Random number = " + number);

        int ferstNumber = number/100;
        int secondNumber = (number - ferstNumber*100)/10;
        int thirdNumber = (number - ferstNumber*100 - secondNumber*10);
        System.out.println("Random number consists from - " + ferstNumber + " " + secondNumber + " " + thirdNumber);

        //variable "temporary" was initialized before
        if(ferstNumber > secondNumber){
            temporary = ferstNumber;
        }else {
            temporary = secondNumber;
        }
        if(temporary < thirdNumber){
            temporary = thirdNumber;
        }
        System.out.println("MAX number = " + temporary);

        //task 5

        int iterance = 1;
        int guessNumber = -1; // valid range 0-100
        int randonNumber = random.nextInt(101); // method Random was initialised before in the task 4

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

        //task 6

        //method Random was initialised before in the task 4
        int date = 1 + random.nextInt(31);
        int month = 1 + random.nextInt(12);

        switch (month) {
            case 1:
                if (date <= 31) {
                    System.out.println("Дата - " + date + " Января");
                }else {
                    System.out.println("Дата - " + date + " Января - не являеться валидной");
                };
                break;
                case 2:
                if (date <= 29) {
                    System.out.println("Дата - " + date + " Февраля");
                }else {
                    System.out.println("Дата - " + date + " Февраля - не являеться валидной");
                };
                break;
                case 3:
                if (date <= 31) {
                    System.out.println("Дата - " + date + " Марта");
                }else {
                    System.out.println("Дата - " + date + " Марта - не являеться валидной");
                };
                break;
                case 4:
                if (date <= 30) {
                    System.out.println("Дата - " + date + " Апреля");
                }else {
                    System.out.println("Дата - " + date + " Апреля - не являеться валидной");
                };
                break;
                case 5:
                if (date <= 31) {
                    System.out.println("Дата - " + date + " Мая");
                }else {
                    System.out.println("Дата - " + date + " Мая - не являеться валидной");
                };
                break;
                case 6:
                if (date <= 30) {
                    System.out.println("Дата - " + date + " Июня");
                }else {
                    System.out.println("Дата - " + date + " Июня - не являеться валидной");
                };
                break;
                case 7:
                if (date <= 31) {
                    System.out.println("Дата - " + date + " Июля");
                }else {
                    System.out.println("Дата - " + date + " Июля - не являеться валидной");
                };
                break;
                case 8:
                if (date <= 31) {
                    System.out.println("Дата - " + date + " Августа");
                }else {
                    System.out.println("Дата - " + date + " Августа - не являеться валидной");
                };
                break;
                case 9:
                if (date <= 30) {
                    System.out.println("Дата - " + date + " Сентября");
                }else {
                    System.out.println("Дата - " + date + " Сентября - не являеться валидной");
                };
                break;
                case 10:
                if (date <= 31) {
                    System.out.println("Дата - " + date + " Октября");
                }else {
                    System.out.println("Дата - " + date + " Октября - не являеться валидной");
                };
                break;
                case 11:
                if (date <= 30) {
                    System.out.println("Дата - " + date + " Ноября");
                }else {
                    System.out.println("Дата - " + date + " Ноября - не являеться валидной");
                };
                break;
                case 12:
                if (date <= 31) {
                    System.out.println("Дата - " + date + " Декабря");
                }else {
                    System.out.println("Дата - " + date + " Декабря - не являеться валидной");
                };
                break;
        }

    }
}
