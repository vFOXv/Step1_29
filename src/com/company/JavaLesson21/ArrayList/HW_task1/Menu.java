package com.company.JavaLesson21.ArrayList.HW_task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private int position;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int myMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Element Add  in List                   1");
        System.out.println("Element delete  from List              2");
        System.out.println("Show list contents                     3");
        System.out.println("Check if there is a value in the list  4");
        System.out.println("Change value in the list               5");
        System.out.println("Exit from the program                  6");

        try {
            position = scanner.nextInt();
            return position;
        } catch (InputMismatchException e) {
            System.err.println("You enter not number!!!");
            e.printStackTrace();
        }
        return 7;
    }
}
