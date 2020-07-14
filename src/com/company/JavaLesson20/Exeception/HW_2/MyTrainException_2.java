package com.company.JavaLesson20.Exeception.HW_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MyTrainException_2 {
    private int number;
    private boolean flag;

    public MyTrainException_2() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }


    public void scan() throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter random integer number.");
        setNumber(scanner.nextInt());
    }

    public void myTrainException() {
        while (true) {
            setFlag(true);
            try {
                scan();                                                   // компилятор не ругаеться без try-catch хотя объявлено throws
            } catch (InputMismatchException e) {
                System.err.println("You enter no integer number!!!");
                System.err.println("Runtime Exception/Unchecked");
                //не работает getStackTrace() и  как в этом варианте иапользовать getMessage
                // (без использования throw(нет доступа к сигнатуре при создании нового объекта для передачи строки))
                e.printStackTrace();
                setFlag(false);
            }
            if (flag) {
                if (number > 100) {
                    try {
                        double result = getNumber() / 0;

                    } catch (ArithmeticException e) {
                        System.out.println("Division by zero/Деление на ноль");
                        System.out.println("Runtime Exception/unchecked");
                        e.getMessage();                                                             //не работает  getMessage()
                        e.printStackTrace();
                    }
                } else if (number < 0) {
                    try {
                        File file = new File("E://file.txt");
                        FileReader fr = new FileReader(file);
                    } catch (FileNotFoundException e) {
                        System.out.println("Exception/Checked");
                        e.getMessage();
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("You enter number " + getNumber());
                }
            }
        }
    }
}
