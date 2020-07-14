package com.company.JavaLesson5;

import java.util.Scanner;

public class Java5HW_task1 {
    public static void main(String[] args) {
        /*Написать программу, которая запрашивает у пользователя номер билетика (шестизначное число).
        Определить является ли билет счастливым (сумма первых трёх чисел, должна быть равна последним трём).
        Если билетик счастливый вывести на экран сообщение: «Везунчик! Твой билетик счастливый J».
        В противном случае: «Увы! Ваш билет не счастливый .*/
        int number = 0;
        boolean notInt = false;

        System.out.println("Enter ticket number.");
        Scanner scanner = new Scanner(System.in);
        if (notInt = scanner.hasNextInt()) {
            number = scanner.nextInt();
            if (number<99999 || number % 1000000 != number ) {  //проверка на знак числа(- не проходит по условию) и разряд
                System.out.println("You must write all numbers ");
            }else {
                int number1 = number/100000;
                int number2 = (number/10000)%10;
                int number3 = (number/1000)%10;
                int number4 = (number/100)%10;
                int number5 = (number/10)%10;
                int number6 = number%10;

                int number1_3 = number1+number2+number3;
                int number4_6 = number4+number5+number6;
                if(number1_3 == number4_6){
                    System.out.println("Сongratulations!!! Your ticket is happy!");
                }else{
                    System.out.println("Alas, your ticket not happy.");
                }
            }
        } else if (notInt == false) {
            System.out.println("You write not number ticket!");
            scanner.close();
        }
    }
}
