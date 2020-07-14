package com.company.JavaLesson16.HW16.Task1work;

public class CoordinatePoint {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private Triangle triangle;

    public CoordinatePoint(){

    }

    public CoordinatePoint(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }

    @Override
    public String toString() {
        return "CoordinatePoint{" +
                "(x1=" + x1 +
                ", y1=" + y1 +")"+
                ", (x2=" + x2 +
                ", y2=" + y2 +")"+
                ", (x3=" + x3 +
                ", y3=" + y3 +")"+
                //", triangle=" + triangle +
                '}';
    }
}
