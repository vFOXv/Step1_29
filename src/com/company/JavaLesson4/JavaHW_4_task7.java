package com.company.JavaLesson4;

import java.util.Scanner;

public class JavaHW_4_task7 {
    public static void main(String[] args) {
         /* Найти:
a. Сумму всех чисел от 100 до 500;
b. Сумму всех целых чисел от a до 500 (значение a вводится с клавиатуры a <= 500);
c. Сумму всех четных чисел от a до b (значение a и b вводится с клавиатуры b >= a);
d. Среднее арифметическое всех целых чисел от a до b (значение a и b вводится с клавиатуры b >= 100); */
        // Code consider sun numbers from 100 to 500
        int allSum = 0;
        for (int i = 100; i <= 500; i++) {
            allSum = allSum + i;
        }
        System.out.println("Sum all numbers from 100 to 500 = " + allSum);

        // Code consider sum numbers from number A to 500
        allSum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("You must write number A. It must <= 500.");
        int a = scanner.nextInt();
        if (a <= 500) {
            for (; a <= 500; a++) {
                allSum = allSum + a;
            }
            System.out.println("Sum all numbers from number A to 500 = " + allSum);
        } else {
            System.out.println("Incorrect value number A. It must <= 500.");
        }

        //Code consider sum all even numbers from A to B(B>=A)
        allSum = 0;

        System.out.println("You must write numbers A and B(B>=A)");
        System.out.println("Write numbers A.");
        a = scanner.nextInt();
        System.out.println("Write numbers B");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("Incorrect value numbers A or B.B must >=A)");
        }
        if (b >= a) {
            if ((a*10 / 2) % 2 == 0) {
                for (; a <= b; a = a + 2) {
                    allSum = allSum + a;
                }
                System.out.println(" 1 Sum all even numbers from number A to B = " + allSum);
            }
            if ((a*10 / 2) % 2 != 0) {
                a = a + 1;
                for (; a <= b; a = a + 2) {
                    allSum = allSum + a;
                }
                System.out.println(" 2 Sum all even numbers from number A to B = " + allSum);
            }
        }
        // Code consider average all even numbers from A to b(b>=0)
        System.out.println("You must write numbers A and B(B>=100).");
        System.out.println("Write numbers A.");
        a = scanner.nextInt();
        System.out.println("Write numbers B");
        b = scanner.nextInt();
        if (b<100 ) {
            System.out.println("Incorrect value numbers B. B must >=100.");
        }
        if (b<a){
            System.out.println("Incorrect value numbers A or B.B must >=A)");
        }
        if (b >= a & b>=100) {
            int middle = b-a;
                for (; a <= b; a = a + 2) {
                    allSum = allSum + a;
                }
                System.out.println(" 1 Sum all numbers from number A to B = " + allSum/middle);
            }
            scanner.close();
        }

    }

