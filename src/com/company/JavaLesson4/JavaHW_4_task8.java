package com.company.JavaLesson4;

import java.util.Scanner;

public class JavaHW_4_task8 {
    public static void main(String[] args) {
        //9. Даны натуральный числа x и y. Вычислить произведение xy, используя лишь оператор сложения.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число Х");
        double x = scanner.nextDouble();
        System.out.println("Введите число У");
        double y = scanner.nextDouble();
        double sum = 0;
        for(int i = 0; i < y; i++){
sum = sum + x;
        }
        System.out.println(" Х*У = " + sum);
    }
}
