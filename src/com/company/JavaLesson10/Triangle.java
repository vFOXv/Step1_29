package com.company.JavaLesson10;

import java.util.Scanner;

public class Triangle {

    public static boolean sum(int first, int second, int third){
        boolean possibility = false;

        if(first < second + third && second<first+third&& third< first+second){
            possibility = true;
        }
        return possibility;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 parties");
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        System.out.println(sum(first,second,third));
    }
}
