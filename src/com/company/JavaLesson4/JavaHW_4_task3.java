package com.company.JavaLesson4;

public class JavaHW_4_task3 {
    public static void main(String[] args) {
        /* Напечатать числа в виде:
        20 20 20 20 20
        20 20 20 20 20*/
        for (int i = 0; i <= 9; i++) {
            System.out.print(20 + "\t");
            if (i == 4) {
                System.out.print("\n");
            }
        }
    }
}
