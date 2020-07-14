package com.company.JavaLesson16.HW16.Task1work;

public class Triangle {
    int numberTriangle;
    CoordinatePoint coordinatePoint;

    public Triangle(){
        coordinatePoint = new CoordinatePoint();
    }

    public Triangle(int numberTriangle) {
        this.numberTriangle = numberTriangle;
    }

    public int getNumberTriangle() {
        return numberTriangle;
    }

    public void setNumberTriangle(int numberTriangle) {
        this.numberTriangle = numberTriangle;
    }

    public CoordinatePoint getCoordinatePoint() {
        return coordinatePoint;
    }

    public void setCoordinatePoint(CoordinatePoint coordinatePoint) {
        this.coordinatePoint = coordinatePoint;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "numberTriangle='" + numberTriangle + '\''
                + coordinatePoint +
                '}';
    }
}
