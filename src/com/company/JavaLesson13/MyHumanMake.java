package com.company.JavaLesson13;

import java.util.Scanner;

public class MyHumanMake {
    private int age;
    private String name;

    public MyHumanMake() {

    }

    public MyHumanMake(int age) {
        this.age = age;
    }

    public MyHumanMake(String name) {
        this(18);
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String scanName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        setName(scan.nextLine());
        return name;
    }

    public int scanAgo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        setAge(scan.nextInt());
        return age;
    }

//    public void check(){
//        if(scanAgo() == (int)char myChar ='\n' ){
//            new HumanMake("");
//        }
//    }

    public void print() {
        System.out.println("Name " + getName());
        System.out.println("Age " + getAge());
    }


}
