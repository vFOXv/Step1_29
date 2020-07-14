package com.company.JavaLesson13;

import java.util.Scanner;

public class HumanParts {
    private String fullName;
    private String dateOfBirth;
    private String phone;
    private String country;
    private String city;
    private String address;

    public HumanParts() {

    }

    public HumanParts(String fullName, String dateOfBirth, String phone, String country, String city, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.country = country;
        this.city = city;
        this.address = address;
    }

    public String getFullname() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
        System.out.println("Enter full name");
        setFullName(scan());
        System.out.println("Enter date of birth");
        setDateOfBirth(scan());
        System.out.println("Enter number phone");
        setPhone(scan());
        System.out.println("Enter country");
        setCountry(scan());
        System.out.println("Enter city");
        setCity(scan());
        System.out.println("Enter address");
        setAddress(scan());
    }

    public void takeOutData() {
        System.out.println("Full name: \t" + getFullname());
        System.out.println("Date of birth: \t" + dateOfBirth);
        System.out.println("Number phone: \t" + phone);
        System.out.println("Country: \t" + country);
        System.out.println("City: \t" + city);
        System.out.println("Address: \t" + address);
    }

}
