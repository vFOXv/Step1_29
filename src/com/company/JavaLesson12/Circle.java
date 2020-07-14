package com.company.JavaLesson12;

public class Circle {
    //свойства класса
    public double x;
    public double y;
    public double r;
    //public double length;
    public double area;

    public Circle() {
    }

    //методы класса
    public void printCircle() {
        System.out.println("Оксружность центр " + x + " : " + y + " радиус " + r);
    }

    public void myPrintCircle(){
        System.out.println("Circle's length = " + lengthCircle(r));
        System.out.println("Circle's area = "+ areaCircle(r));
    }

    public void moveCircle(double a, double b) {
        x = x + a;
        y = y + b;
    }

    public void zoomCircle(double k) {
        r = r * k;
    }

    public static double lengthCircle(double r){
        double length = 2*Math.PI*r;
        return length;

    }

    public static double areaCircle(double r){
        double area = 2*Math.PI*Math.pow(r,2);
        return area;
    }
}