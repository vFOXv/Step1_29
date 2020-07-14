package com.company.JavaLesson2;

import java.util.Scanner;

public class EnterDataExample {
    public static void main(String[] args) {
//        System.out.println("Введите ФИО ");
          Scanner scanner = new Scanner(System.in);
//        String FIO = scanner.nextLine();
//        System.out.println("Введите свой возраст");
//        int age = scanner.nextInt();
//        System.out.println("Вы " + FIO + " И Ваш возрост" + age);
//        scanner.close();
        System.out.println("Введите а = ");
        double a = scanner.nextDouble();
        System.out.println("Введите b = ");
        double b = scanner.nextDouble();
        System.out.println("Введите x = ");
        double x = scanner.nextDouble();
        System.out.println("Введите y = ");
        double y = scanner.nextDouble();
        System.out.println(3*Math.sqrt(x));
        System.out.println(Math.sin(a)*Math.cos(b)+Math.cos(a)*Math.sin(b));
        System.out.println(3*Math.sin(2*a)*Math.cos(3*b));
        System.out.println(-5*Math.sqrt(x+Math.sqrt(y)));
        scanner.close();

    }
}
