package com.company.JavaLesson16.HW16.Task1;

public class RunTriangle {
    //В рамках некоторой системы необходимо разработать набор классов
    //для хранения информации о треугольниках на плоскости.
    //Известно, что треугольник состоит из трех точек.
    public static void main(String[] args) {

        CoordinatePoint coordinatePoint = new CoordinatePoint();
        Triangle triangle = new Triangle();

        Triangle arrayTriangle[] = {
                new Triangle(new CoordinatePoint(1, 2), new CoordinatePoint(2, 3), new CoordinatePoint(3, 4)),
                new Triangle(new CoordinatePoint(2, 3), new CoordinatePoint(3, 4), new CoordinatePoint(4, 5)),
                new Triangle(new CoordinatePoint(3, 4), new CoordinatePoint(4, 5), new CoordinatePoint(5, 6)),
                new Triangle(new CoordinatePoint(4, 5), new CoordinatePoint(5, 6), new CoordinatePoint(6, 7)),
        };

        for (Triangle triangle1 : arrayTriangle) {
            System.out.println(triangle1);
        }
    }
}
