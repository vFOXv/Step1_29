package com.company.JavaLesson16.HW16.Task1work;

public class RunTriangle {
    //В рамках некоторой системы необходимо разработать набор классов
    //для хранения информации о треугольниках на плоскости.
    //Известно, что треугольник состоит из трех точек.
    public static void main(String[] args) {

        CoordinatePoint coordinatePoint1 = new CoordinatePoint(1,2,2,3,3,4);
        Triangle triangle1 = new Triangle(1);
        triangle1.setCoordinatePoint(coordinatePoint1);
        coordinatePoint1.setTriangle( triangle1);
        System.out.println(triangle1);

        CoordinatePoint coordinatePoint2 = new CoordinatePoint(2,3,3,4,4,5);
        Triangle triangle2 = new Triangle(2);
        triangle2.setCoordinatePoint(coordinatePoint2);
        coordinatePoint2.setTriangle( triangle2);
        System.out.println(triangle2);
    }
}
