package com.company.JavaLesson20.Exeception.HW_3;

import java.util.InputMismatchException;

import java.util.Scanner;

public class MyTrainException_3 {
    private int number;
    private int array[];
    private int length;

    public MyTrainException_3() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public void scan() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter random integer number.");
        setNumber(scanner.nextInt());
    }

    public void createRandomArray() {
        //ввод числа (числителя) об которое будует делиться элементы массива
        while (true) {
            try {
                scan();                                                   // компилятор не ругаеться без try-catch хотя объявлено throws
                break;
            } catch (InputMismatchException e) {
                System.err.println("You enter no integer number!!!");
                System.err.println("Runtime Exception/Unchecked");
                //не работает getStackTrace() и  как в этом варианте иапользовать getMessage
                // (без использования throw(нет доступа к сигнатуре при создании нового объекта для передачи строки))
                e.getStackTrace();
            }
        }

        //задание длины массва
        while (true) {
            try {
                //setLength(50);
                setLength((int) (Math.random() * 12 - 1));   //длина массива от -1 до 10
                //length = (int)( Math.random() +1);
                System.out.println("Array's length = " + getLength());
                array = new int[getLength()];
                break;
            } catch (NegativeArraySizeException e) {
                System.err.println("Try create array with negative size!!!/ Массив с отрицательной длиной");
                e.getMessage();
                e.printStackTrace();
            }
        }

        //заполнение массива
        try {
            for (int i = 0; i <= array.length; i++) {
                array[i] = (int) (Math.random() * 21 - 10);   //значения массива от -10 до 10
                System.out.print(array[i]+"  ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println();
            System.err.println("Come out bound array!!!");
            e.getMessage();
            e.printStackTrace();
        }
    }

        public void division(){
            //деление числа на элементы массива
            try {
                for (int i = 0; i < array.length; i++) {
                    System.out.print((double) number / array[i] + "  ");
                }
            } catch (ArithmeticException e) {
                System.out.println("Division by zero/Деление на ноль");
                e.getMessage();
                e.printStackTrace();
            }
        }

}
