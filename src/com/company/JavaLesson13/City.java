package com.company.JavaLesson13;

public class City {
    //* Создайте класс «Город» (City). Необходимо хранить в по-
    // * лях класса: название города (name), название региона (region), название
    // * страны (country), количество жителей в городе (inhabitants), почтовый индекс
    // * города (index), телефонный код города (code). Реализуйте методы клас-
    // * са для ввода данных, вывода данных, реализуйте конструктор с параметром и по умолчанию.

    public static void main(String[] args) {
        System.out.println("Constructor created.");
        CityParts cityPartsData = new CityParts("Ukrine", "Odessa'area", "Odessa", "1 000 000", "123456789", "048");
        cityPartsData.takeOutData();
        System.out.println();

        System.out.println("Constructor default.");
        CityParts cityParts = new CityParts();
        cityParts.enterData();
        cityParts.takeOutData();
    }
}
