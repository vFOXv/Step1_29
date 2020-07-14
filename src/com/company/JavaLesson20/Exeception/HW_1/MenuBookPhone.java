package com.company.JavaLesson20.Exeception.HW_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuBookPhone {
    int answerMenu;

    public MenuBookPhone() {
    }

    public MenuBookPhone(int answerMenu) {
        this.answerMenu = answerMenu;
    }

    public int getAnswerMenu() {
        return answerMenu;
    }

    public void setAnswerMenu(int answerMenu) {
        this.answerMenu = answerMenu;
    }

    public void menu() {
        int cache = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("If you want add new contact enter   1");
        System.out.println("If you want delete contact enter    2");
        System.out.println("If you want find contact enter      3");
        System.out.println("If you want see all contact enter   4");
        System.out.println("If you want close application enter 5");
        System.out.println("If you want use toString            6");


//
//        if (scanner.hasNextInt()) {
//            cache = scanner.nextInt();
//            if (cache > 0 && cache < 7) {
//                answerMenu = cache;
//            }else{
//                System.err.println("You enter not correct data!!!");
//            }
//        } else {
//            System.err.println("You enter not correct data!!!");
//        }


        try {                                                                           //try-catch
                cache = scanner.nextInt();
                if (cache > 0 && cache < 7) {
                    answerMenu = cache;
                } else {
                    System.err.println("You enter not correct data!!! Enter 1...6");
                }

        } catch (InputMismatchException e) {
            System.err.println("You enter not correct data!!! Enter 1...6");
            System.out.println();
            e.printStackTrace();
            System.out.println();
           // e.getMessage();
        }
    }
}
