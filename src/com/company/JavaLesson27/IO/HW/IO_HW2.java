package com.company.JavaLesson27.IO.HW;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IO_HW2 {
    ArrayList<Integer> arrays = new ArrayList<>();
    //Scanner scanner = null;
    int array[];

    public void inputScanner(File file) {

        try (Scanner scanner = new Scanner(new FileInputStream(file))) { // Если создание сылки Scanner вынесенн за пределы try, компилятор его не видит, почему?
            int myLength = new FileInputStream(file).available();
            array = new int[myLength];
//            if(scanner.hasNextInt()) {
//                arrays.add(scanner.nextInt());                      // Как привести scanner.nextInt() к Integer? ---> не могу записать в List.
//            }
//
//            for (Integer integer : arrays) {
//                System.out.println(integer);
//            }
            int useSize = 0;

//            while (scanner.hasNextInt()) {                                //в этом варианте читает до первого символа который не цифра--->(false)--->выход из цикла
//                array[useSize] = scanner.nextInt();
//                useSize++;
//            }

            for (int i = 0; i < myLength; i++) {
                if (scanner.hasNextInt()) {
                    array[useSize] = scanner.nextInt();
                    useSize++;
                } else if (scanner.hasNext()) {                                     //работает при наличее в файле символов разделенных с цифрами пробелом
                    scanner.next();                                                 // ----->    как выбрать цифры если "символ стоит без пробела к цифре"???
                }
            }

            System.out.println("Size use = " + useSize);
            System.out.print("We get array: ");

            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();

            System.out.print("После обрезания масив превращаеться: ");
            array = Arrays.copyOf(array, useSize);
            for (int i : array) {
                System.out.print(i + " ");
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (IOException e) {                               // Исключение IOException после FileNotFoundException не воспинимает?
            e.printStackTrace();
        }
    }

    public void myStream() {
        //подсчет колличества чисел
        long quantityNumbers = Arrays.stream(array)
                .count();
        System.out.println("Quantity numbers = " + quantityNumbers);

        //подсчет суммы чисел
        System.out.println("Sum numbers = " + Arrays.stream(array)
                .sum());

        //подсчет количества четных чисел
        long quantityEvenNumbers = Arrays.stream(array)
                .filter(s -> s % 2 == 0)
                .count();
        System.out.println("Quantity even numbers = " + quantityEvenNumbers);

        //подсчет процента четных чисел
        System.out.println("Percentage of even numbers = " + ((double) quantityEvenNumbers) * 100 / (double) quantityNumbers + "%");
    }
}
