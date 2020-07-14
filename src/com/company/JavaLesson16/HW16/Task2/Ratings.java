package com.company.JavaLesson16.HW16.Task2;

import java.util.Scanner;

public class Ratings {
    private int rating1;
    private int rating2;
    private int rating3;
    private double middleRating;
    private Student student;


    public Ratings() {    }

    public Ratings(int rating1, int rating2, int rating3) {
        this.rating1 = rating1;
        this.rating2 = rating2;
        this.rating3 = rating3;
    }

    public int getRating1() {
        return rating1;
    }

    public void setRating1(int rating1) {
        this.rating1 = rating1;
    }

    public int getRating2() {
        return rating2;
    }

    public void setRating2(int rating2) {
        this.rating2 = rating2;
    }

    public int getRating3() {
        return rating3;
    }

    public void setRating3(int rating3) {
        this.rating3 = rating3;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getMiddleRating() {
        return middleRating;
    }

    public void setMiddleRating(double middleRating) {
        this.middleRating = middleRating;
    }

    public void middleRating() {
        double cache = (double) ((getRating1() + getRating2() + getRating3())) / 3;
        setMiddleRating( cache);
    }

    @Override
    public String toString() {
        return " Ratings{" +
                "rating1= " + rating1 +
                ", rating2= " + rating2 +
                ", rating3= " + rating3 +
                ", middleRating= " + middleRating +
//                ", student=" + student +
                '}';
    }
}
