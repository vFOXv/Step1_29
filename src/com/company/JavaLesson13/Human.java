package com.company.JavaLesson13;

public class Human {
    // * Создайте класс «Человек» (Human). Необходимо хранить
    // * в полях класса: ФИО (fullName), дату рождения (String dateOfBirth), контактный теле-
    // * фон (phone), город (city), страну (country), домашний адрес (address).
    // * Реализуйте методы класса для ввода данных, вывода данных, реализуйте
    // * доступ к отдельным полям через методы класса, конструктор с параметрами
    // * и по умолчанию

    public static void main(String[] args) {

        System.out.println("Created constructor.");
        HumanParts humanPartsData = new HumanParts("Evgen Fox", "13.13.13", "+380502136547", "Ukraine", "Odessa","Ivanova 18" );
        humanPartsData.takeOutData();
        System.out.println();

        System.out.println("Default constructor.");
        HumanParts humanParts = new HumanParts();
        humanParts.enterData();
        humanParts.takeOutData();
    }
}
