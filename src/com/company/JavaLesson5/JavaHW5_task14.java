package com.company.JavaLesson5;

public class JavaHW5_task14 {
    public static void main(String[] args) {
        //Найти 15 первых натуральных чисел, делящихся нацело на 19 и находящихся в интервале, левая граница которого равна 100. 
        int step = 0;
        double number = 100.0;

        while (step < 15) {

            if((number/19)%1 == 0){
                System.out.print((int)number + " ");
                step++;
            }
            number++;
        }
    }

}
