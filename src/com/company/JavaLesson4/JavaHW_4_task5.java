package com.company.JavaLesson4;

public class JavaHW_4_task5 {
    public static void main(String[] args) {
        /*. Одна еScanner scanner = new
          Scanner scanner = newafrom диница некоторого товара стоит 24,5 грн. Напечатать таблицу стоимости 2, 3 ... 20 штук этого товара.*/
        int reiteration = 1;
        while (reiteration <= 20) {
            System.out.println("№ " + reiteration + "\t" + (double)reiteration * 24.5 + " UAH");
            reiteration++;
        }
    }
}
