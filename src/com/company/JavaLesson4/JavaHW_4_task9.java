package com.company.JavaLesson4;

import java.util.Random;
import java.util.Scanner;

public class JavaHW_4_task9 {
    public static void main(String[] args) {
        /* Игра Угадайка. Сгенерируйте число от 0 до 100. Пользователь должен угадать полученное число за 7 попыток.
        После каждой попытки выводим сообщение «Мало» или «Много» (подсказка для пользователя). Если после семи попыток
         пользователь не смог угадать число, сообщите ему о проигрыше и какое число было загадано.
         */
        Random random = new Random();
        int iterance = 1;
        int guessNumber = -1; // valid range 0-100
        int randonNumber = random.nextInt(101);

        while (iterance < 8 && guessNumber != randonNumber) {

            System.out.println("You must write integer number from 0 to 100. Iterance = " + iterance);

            Scanner scanner = new Scanner(System.in);
            guessNumber = scanner.nextInt();

            if (guessNumber == randonNumber) {
                System.out.println("You guess the number! Congrats!");
            } else if (guessNumber > randonNumber) {
                System.out.println("Number is big.");
            } else if (guessNumber < randonNumber) {
                System.out.println("Number is little.");
            } else if (iterance == 7) {
                System.out.println("You lose. Guess number = " + randonNumber);
            }
            iterance++;
        }
    }
}
