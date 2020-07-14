package com.company.JavaLesson14.JavaLesson14_task_2;

import java.util.Scanner;

public class Man {

    private String name;
    private double ago;
    private String sex;
    private double weight;

    public Man() {

    }

    public Man(String name, double ago, String sex, double weight) {
        this.name = name;
        this.ago = ago;
        this.sex = sex;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAgo() {
        return ago;
    }

    public void setAgo(double ago) {
        this.ago = ago;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    //Ввод описания
    public void enterNewDescriptionFull() {
        System.out.println("Do you want enter full description man? Enter yes/no.");
        while (true) {
            Scanner scan = new Scanner(System.in);
            String answer = scan.nextLine();
            if (answer.isEmpty()) {
                System.err.println("You enter empty line! Enter answer!");
            } else if (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
                System.err.println("You not enter answer! Enter answer!");
            } else if (answer.equalsIgnoreCase("no")) {
                break;
            } else if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Enter name man:");
                setName(check());

                System.out.println("Enter ago man:");
                setAgo(checkNumber());

//                System.out.println("Enter sex man");
//                setSex(check());

                System.out.println("Enter weight man");
                setWeight(checkNumber());

                System.out.println("Name: \t" + getName());
                System.out.println("Ago: \t" + getAgo());
                System.out.println("Sex: \t" + getSex());
                System.out.println("Weight: " + getWeight());
                System.out.println("\n");

                break;
            }
        }
    }

    public String check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data!");
        String data = scanner.nextLine();
        if (data.isEmpty()) {
            System.err.println("You enter empty line! ");
            data = data + check();
        }
        return data;
    }

    public double checkNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number!");
        double data = 0;
        if (scanner.hasNextDouble()) {
            data = scanner.nextDouble();
            if (data <= 0) {
                System.err.println("Number must be > 0 !!!");
                data = 0;
                data = data + checkNumber();
            }
        } else {
            System.err.println("You must to enter number!!!");
            data = 0;
            data = data + checkNumber();
        }
        return data;
    }

    //вывод данных о человеке
    public void show() {
        System.out.println("Name: \t" + getName());
        System.out.println("Ago: \t" + getAgo());
        System.out.println("Sex: \t" + getSex());
        System.out.println("Weight: " + getWeight());
    }

}
