package com.company.JavaLesson18.homegeneric;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {

            case 1:
                ArrayEx<Integer> arrayEx = new ArrayEx<>();
                arrayEx.scan(scanner, Integer.class);
                break;
            case 2:
                ArrayEx<Double> doubleEx = new ArrayEx<>();
                doubleEx.scan(scanner, Double.class);
                break;
            case 3:
                ArrayEx<String> strEx = new ArrayEx<>();
                strEx.scan(scanner, String.class);
                break;
        }
    }
}
