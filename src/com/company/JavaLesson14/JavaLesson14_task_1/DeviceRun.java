package com.company.JavaLesson14.JavaLesson14_task_1;

public class DeviceRun {

    public static void main(String arg[]) {
        //Создать базовый класс «Устройство» и производные
        //классы «Чайник», «Микроволновка», «Автомобиль»,
        //«Пароход». С помощью конструктора установить имя
        //каждого устройства и его характеристики.
        //Реализуйте для каждого из классов методы:
        //* Sound — издает звук устройства (пишем текстом в
        //консоль);
        //* Show — отображает название устройства;
        //* Desc — отображает описание устройства.
        System.out.println("Kettle. Constructor Show + Desc");
        Kettle kettle = new Kettle("kettle", "it heats water");
        kettle.showDescription();
        kettle.newSound();
        kettle.showDescription();
        System.out.println("\n");

        System.out.println("Kettle. Constructor Show + Desc + Sound");
        Kettle kettleFull = new Kettle("kettle", "it heats water","bul-bul");
        kettleFull.showDescription();
        kettleFull.newDescriptionFull();

        System.out.println("Microwave. Constructor Show + Desc");
        Microwave microwave = new Microwave("Microwave", "It warms food");
        microwave.showDescription();
        microwave.newSound();
        microwave.showDescription();
        System.out.println("\n");

        System.out.println("Car. Constructor Show + Desc");
        Car car = new Car("Car","It carries loads");
        car.showDescription();
        car.newSound();
        car.showDescription();
        System.out.println("\n");

        //класс параход "Steamboat" оставил без методов. Т.к. методы не переопределяються, а используються без изменений
        // как в радительском классе. Впринципе, методы в дочерних классах в этом задании можно было не писать.
        System.out.println("Steamboat. Constructor Show + Desc");
        Steamboat steamboat = new Steamboat("Steamboat","It is swimming");
        steamboat.showDescription();
        steamboat.newSound();
        steamboat.showDescription();
    }
}

