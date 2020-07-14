package com.company.JavaLesson10;


import java.util.Scanner;

public class Class1 {
    public static int sum(int first, int second) {
        int sum;
        sum = first + second;
        return sum;
    }

    public static int increase(int first, int second) {
        int increase;
        increase = first * second;
        return increase;
    }

    public static double division(int first, int second) {
        double division;
        division = (double)first / second;
        return division;
    }

    public static int subtraction(int first, int second) {
        int subtraction;
        subtraction = first - second;
        return subtraction;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        System.out.println(sum(first,second));
        System.out.println(increase(first,second));
        System.out.println(division(first,second));
        System.out.println(subtraction(first,second));
    }
}
