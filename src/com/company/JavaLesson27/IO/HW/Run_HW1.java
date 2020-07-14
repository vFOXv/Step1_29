package com.company.JavaLesson27.IO.HW;

import java.io.File;

public class Run_HW1 {
//     * Написать метод, который принимает имя файла, в качестве параметра метода,
//     * затем считывает этот файл и возвращает все текстовое содержимое
//     * этого файла в виде строки.
    public static void main(String[] args) {
        IO_HW1 io1 = new IO_HW1();
        File file = new File("src/com/company/JavaLesson27/IO/HW/HW_1.txt");
        //io1.printFile(file);
        //io1.printFileArray(file);
        io1.printFileBuffer(file);
    }
}
