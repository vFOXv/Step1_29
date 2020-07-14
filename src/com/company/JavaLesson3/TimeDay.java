package com.company.JavaLesson3;

import java.util.Scanner;

public class TimeDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время");
        int time = scanner.nextInt();
        if(time >=3 & time < 12){
            System.out.println("Now morning.");
    } else if(time >=12 & time<18){
            System.out.println("Now day.");
        } else if(time >=18 & time<24) {
            System.out.println("Now evening.");
        } else if(time >= 0  & time <3 || time == 24){
            System.out.println("Now night");
        } else {
            System.out.println("You don't right)))");
        }
        scanner.close();
    }
}
