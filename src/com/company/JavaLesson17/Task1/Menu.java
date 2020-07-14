package com.company.JavaLesson17.Task1;

import java.util.Scanner;

public class Menu {
    private int typeArray;
    private int length;

    public Menu() {
    }


    public int getTypeArray() {
        return typeArray;
    }

    public void setTypeArray(int typeArray) {
        if (typeArray > 0 && typeArray < 4) {
            this.typeArray = typeArray;
        } else {
            System.err.println("setTypeArray ERROR!!! typeArray 1 or 2 or 3 !!!");
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    //выбор типа создоваемого массива
    public void arrayChoiceType() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select type array: 1-Integer/2-Double/3-String. Enter 1/2/3");
            if (scanner.hasNextInt()) {
                int cache = scanner.nextInt();
                if (cache >= 1 && cache <= 3) {
                    setTypeArray(cache);
                    break;
                } else {
                    System.err.println("You mast enter number 1 or 2 or 3!!!");
                }
            } else {
                System.err.println("You must enter integer number!!! ");
            }
        }
    }

    //задание длины масива с клавиатуры
    public void arrayLength() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter arrays's length");
            if (scanner.hasNextInt()) {
                int length = scanner.nextInt();
                if (length > 0) {
                    setLength(length);
                    break;
                }
            } else {
                System.err.println("You must enter integer number!!! ");
            }
        }
    }

    //выбор - заполнять масив в ручную или нет
    public boolean arrayChoiceFillScan() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you want filling array with keyboard?  Yes/No ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Yes")) {
                return true;
            } else if (answer.equalsIgnoreCase("No")) {
                return false;
            } else {
                System.err.println("You enter incorrect answer!!!");
            }
        }
    }

    //выбор - заполнять масив рандомными значениями или нет
    public boolean arrayChoiceFillRandom() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you want filling array random volume?  Yes/No ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Yes")) {
                return true;
            } else if (answer.equalsIgnoreCase("No")) {
                return false;
            } else {
                System.err.println("You enter incorrect answer!!!");
            }
        }
    }

    //выбор - искать мах значения или нет
    public boolean arrayMaxMin() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you want to find MAX and MIN volume?  Yes/No ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Yes")) {
                return true;
            } else if (answer.equalsIgnoreCase("No")) {
                return false;
            } else {
                System.err.println("You enter incorrect answer!!!");
            }
        }
    }

    //выбор - искать среденее значения или нет
    public boolean arrayMiddle() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you want to find middle volume?  Yes/No ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Yes")) {
                return true;
            } else if (answer.equalsIgnoreCase("No")) {
                return false;
            } else {
                System.err.println("You enter incorrect answer!!!");
            }
        }
    }

    //выбор - делать сортировку по возросттанию или нет
    public boolean arraySortGrow() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you want to make sort of grow?  Yes/No ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Yes")) {
                return true;
            } else if (answer.equalsIgnoreCase("No")) {
                return false;
            } else {
                System.err.println("You enter incorrect answer!!!");
            }
        }
    }

    // сортировка массива по убыванию
    public boolean arraySortDecrease() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you want to make sort of decrease(по убыванию)?  Yes/No ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Yes")) {
                return true;
            } else if (answer.equalsIgnoreCase("No")) {
                return false;
            } else {
                System.err.println("You enter incorrect answer!!!");
            }
        }
    }

    // поиск значения в массиве, используя бинарный поиск
    public boolean arrayBinary() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you want to make binary search?  Yes/No ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Yes")) {
                return true;
            } else if (answer.equalsIgnoreCase("No")) {
                return false;
            } else {
                System.err.println("You enter incorrect answer!!!");
            }
        }
    }

    // замена значения в массиве на новое значение
    public boolean arrayChangeVolume() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Are you want to change volume in array?  Yes/No ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Yes")) {
                return true;
            } else if (answer.equalsIgnoreCase("No")) {
                return false;
            } else {
                System.err.println("You enter incorrect answer!!!");
            }
        }
    }
}
