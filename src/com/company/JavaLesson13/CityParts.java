package com.company.JavaLesson13;

import java.util.Scanner;

public class CityParts {
    //* Создайте класс «Город» (City). Необходимо хранить в по-
    // * лях класса: название города (name), название региона (region), название
    // * страны (country), количество жителей в городе (inhabitants), почтовый индекс
    // * города (index), телефонный код города (code). Реализуйте методы клас-
    // * са для ввода данных, вывода данных, реализуйте конструктор с параметром и по умолчанию.
    private String country;
    private String region;
    private String name;
    private String inhabitants;
    private String index;
    private String code;

    public CityParts(String country, String region, String name, String inhabitants, String index, String code) {
        this.country = country;
        this.region = region;
        this.name = name;
        this.inhabitants = inhabitants;
        this.index = index;
        this.code = code;
    }

    public CityParts() {

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(String inhabitants) {
        this.inhabitants = inhabitants;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String scan() {
        Scanner scan = new Scanner(System.in);
        String data = scan.nextLine();
        while (data.isEmpty()) {
            System.err.println("This string is empty! Enter data!");
            Scanner scan1 = new Scanner(System.in);
            data = scan1.nextLine();
        }
        return data;
    }

    public void enterData() {
        System.out.println("Enter country");
        setCountry(scan());
        System.out.println("Enter region");
        setRegion(scan());
        System.out.println("Enter name city");
        setName(scan());
        System.out.println("Enter inhabitants city");
        setInhabitants(scan());
        System.out.println("Enter index city");
        setIndex(scan());
        System.out.println("Enter city's phone code");
        setCode(scan());
    }

    public void takeOutData() {
        System.out.println("Country \t" + getCountry());
        System.out.println("Region \t" + getRegion());
        System.out.println("City \t" + getName());
        System.out.println("Inhabitants city \t" + getInhabitants());
        System.out.println("Index city \t" + getIndex());
        System.out.println("City's phone code \t" + getCode());
    }

}
