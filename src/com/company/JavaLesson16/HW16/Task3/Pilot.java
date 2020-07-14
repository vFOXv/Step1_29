package com.company.JavaLesson16.HW16.Task3;

public class Pilot extends Profession {
    private String typePlane;

    public Pilot(){  }

    public Pilot(String name, String industry, String typePlane) {
        super(name, industry);
        this.typePlane = typePlane;
    }

    public String getTypePlane() {
        return typePlane;
    }

    public void setTypePlane(String typePlane) {
        this.typePlane = typePlane;
    }

    @Override
    public void makeWork() {
        System.out.println("Make work!/Pilot");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Profession{" +
                "name='" + getName() + '\'' +
                ", industry='" + getIndustry() + '\'' +
                " Pilot{" +
                "typePlane='" + typePlane + '\'' +
                '}'+'}';
    }
}
