package com.company.JavaLesson14.JavaLesson14_task_2;

import java.util.Scanner;

public class Student extends Man {

    private double years;

    public Student() {

    }

    public Student(String name, double ago, String sex, double weight, double years) {
        super(name, ago, sex, weight);
        this.years = years;
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public double yearsStudyChange() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter extra year of study/Введите дополнительные годы обучения");
        double yearsGrow = 0;
        if (scanner.hasNextDouble()) {
            yearsGrow = scanner.nextDouble();
            if (yearsGrow < 0) {
                System.out.println("Years of study can only increase!!!/Годы учебы могут только увеличиться!!!");
                yearsGrow = 0;
                yearsGrow = yearsGrow + yearsStudyChange();
            }
        } else {
            System.err.println("You must to enter number!!!");
            yearsGrow = 0;
            yearsGrow = yearsGrow + yearsStudyChange();
        }
        return yearsGrow;
    }

    public void allStudyYears() {
        double allStudyYears = yearsStudyChange() + getYears();
        setYears(allStudyYears);
    }

    @Override
    public void show() {
        System.out.println("Years of study " + getYears());
    }

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

                System.out.println("Enter years of study");
                setYears(checkNumber());

                System.out.println("Name: \t" + getName());
                System.out.println("Ago: \t" + getAgo());
                System.out.println("Sex: \t" + getSex());
                System.out.println("Weight: " + getWeight());
                System.out.println("Years:  " + getYears());
                System.out.println("\n");

                break;
            }
        }
    }
}
