package com.company.JavaLesson16.HW16.Task2;

public class Student {
    private String firstName;
    private int yearBirth;
    private Ratings ratings;

    public Student() {
    }

    public Student(String firstName, int yearBirth, Ratings ratings) {
        this.firstName = firstName;
        this.yearBirth = yearBirth;
        this.ratings = ratings;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public Ratings getRatings() {
        return ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }

    public void middleRating() {
        ratings.middleRating();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName= '" + firstName + '\'' +
                ", yearBirth= " + yearBirth +
                ratings +
                '}';
    }
}
