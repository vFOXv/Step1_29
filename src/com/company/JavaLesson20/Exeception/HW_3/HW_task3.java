package com.company.JavaLesson20.Exeception.HW_3;

public class HW_task3 {
    //Создать метод, который выводит в консоль результат целочисленного деления числа, введенного
    //с клавиатуры, на значения элементов одномерного массива целых чисел, заполненный случайным
    //образом – от -10 до 10. Длина массива случайная – от 1 до 10.
    //Обработать все возможные исключительные ситуации в данном методе.
    public static void main(String[] args) {
        MyTrainException_3 myTrainException = new MyTrainException_3();

        myTrainException.createRandomArray();
        myTrainException.division();
    }
}
