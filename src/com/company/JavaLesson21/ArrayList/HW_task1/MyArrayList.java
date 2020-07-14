package com.company.JavaLesson21.ArrayList.HW_task1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyArrayList {

    private ArrayList<Double> array = new ArrayList<>();

    public void createArrayList() {
        int size = 0;
        while (true) {
            System.out.println("Enter size array.");
            Scanner scanner = new Scanner(System.in);
            try {
                size = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.err.println("This is not number!!!");
                e.printStackTrace();
            }
        }
        for (int i = 0; i < size; i++) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter array's number.");
                double number = scanner.nextDouble();
                array.add(number);
            } catch (InputMismatchException e) {
                System.err.println("This is not number!!!");
                e.printStackTrace();
            }
            System.out.println("You enter " + i  + " number.");
            if (i == size-1) {
                System.out.println("ArrayList create!");
            }
        }
    }


    public void myAdd() {
        while (true) {
            System.out.println("Enter next value.");
            Scanner scanner = new Scanner(System.in);
            try {
                double position = scanner.nextDouble();
                array.add(position);
                break;
            } catch (InputMismatchException e) {
                System.err.println("You enter not number!!!");
                e.printStackTrace();
            }
        }
    }

    public void myRemove() {
        while (true) {
            System.out.println("Enter index element. This element will delete!!!");
            Scanner scanner = new Scanner(System.in);
            try {
                int position = scanner.nextInt();
                array.remove(position);
                break;
            } catch (InputMismatchException e) {
                System.err.println("You enter not number!!!");
                e.printStackTrace();
            }
        }
    }

    public void myCheck() {
        while (true) {
            System.out.println("Which value are you want find? Enter value.");
            Scanner scanner = new Scanner(System.in);
            try {
                double volume = scanner.nextDouble();
                int index = array.indexOf(volume);
                if (index == -1) {
                    System.out.println("Element not find!!!");
                    break;
                } else {
                    System.out.println("Element be on the " + index + " position");
                    break;
                }
            } catch (InputMismatchException e) {
                System.err.println("You enter not number!!!");
                e.printStackTrace();
            }
        }
    }

    public void printArray() {
        for (Double iter : array) {
            System.out.print(iter + "  ");
        }
        System.out.println();
    }

    public void myChange() {
        while (true) {
            System.out.println("Which value are you want change? Enter index.");
            Scanner scanner = new Scanner(System.in);
            try {
                int index = scanner.nextInt();
                System.out.println("Enter new value.");
                double volume = scanner.nextDouble();
                array.set(index, volume);
                System.out.println("Element be on the " + index + " position");
                break;
            } catch (InputMismatchException e) {
                System.err.println("You enter not number!!!");
                e.printStackTrace();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out array!!!");
            }
        }
    }
}

