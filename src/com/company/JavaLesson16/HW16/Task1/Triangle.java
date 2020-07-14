package com.company.JavaLesson16.HW16.Task1;

public class Triangle {

    CoordinatePoint coordinatePoint1;
    CoordinatePoint coordinatePoint2;
    CoordinatePoint coordinatePoint3;

    public Triangle() {
    }

    public Triangle(CoordinatePoint coordinatePoint1, CoordinatePoint coordinatePoint2, CoordinatePoint coordinatePoint3) {
        this.coordinatePoint1 = coordinatePoint1;
        this.coordinatePoint2 = coordinatePoint2;
        this.coordinatePoint3 = coordinatePoint3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "coordinate1=" + coordinatePoint1 +
                ", coordinate2=" + coordinatePoint2 +
                ", coordinate3=" + coordinatePoint3 +
                '}';
    }
}
