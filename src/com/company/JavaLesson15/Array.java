package com.company.JavaLesson15;

public class Array implements Show{
    private String info;

    public Array() {
    }

    public Array(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    int array[] = {10,12,15,14,13,87,92};

    @Override
    public void print() {
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }

    @Override
    public void print(String info) {
        System.out.println( info);
        for (int i : array) {
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
}
