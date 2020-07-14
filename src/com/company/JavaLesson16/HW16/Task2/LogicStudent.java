package com.company.JavaLesson16.HW16.Task2;

import org.w3c.dom.ls.LSOutput;

public class LogicStudent {
    public Student[] run() {
        Ratings ratings1 = new Ratings(5, 4, 3);
        Ratings ratings2 = new Ratings(3, 3, 4);
        Ratings ratings3 = new Ratings(5, 1, 5);

        Student student1 = new Student("1", 2000, ratings1);
        Student student2 = new Student("2", 2001, ratings2);
        Student student3 = new Student("3", 2003, ratings3);

        student1.middleRating();
        ratings1.setStudent(student1);

        student2.middleRating();
        ratings2.setStudent(student2);

        student3.middleRating();
        ratings3.setStudent(student3);

        student1.setRatings(ratings1);
        student2.setRatings(ratings2);
        student3.setRatings(ratings3);

//        Ratings myRatings[] = {ratings1, ratings2, ratings3};
        Student myStudent[] = {student1, student2, student3};

        return myStudent;
    }

    public void print(Student myStudent[]) {
        for (int i = 0; i < myStudent.length; i++) {
            System.out.println(myStudent[i]);
        }
    }
}
