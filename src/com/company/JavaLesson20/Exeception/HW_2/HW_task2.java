package com.company.JavaLesson20.Exeception.HW_2;



public class HW_task2 {
    //Создать метод, принимающий на вход число. В случае,
    //если число отрицательное, в методе должно быть брошено
    //проверяемое исключение. Если число больше 100, должно
    //быть брошено непроверяемое исключение. Создать свои исключения для данного примера.
    public static void main(String[] args) {
        MyTrainException_2 myTrainException = new MyTrainException_2();

        myTrainException.myTrainException();
    }
}
