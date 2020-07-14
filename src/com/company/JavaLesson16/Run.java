package com.company.JavaLesson16;

public class Run {
    public static void main(String[] args) {
        Klient klient= new Klient();
        Zakaz zakaz = new Zakaz();

        Zakaz myZacaz []= {
                new Zakaz(10, 12.3),
                new Zakaz(12, 13.5)

        };

        klient.setZakaz(myZacaz);

    }
}
