package com.company.JavaLesson16.HW16.Task3;

public abstract class Profession {
private String name;
private String industry;

public Profession(){}

    public Profession(String name, String industry) {
        this.name = name;
        this.industry = industry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public abstract void makeWork();

    @Override
    public String toString() {
        return "Profession{" +
                "name='" + name + '\'' +
                ", industry='" + industry + '\'' +
                '}';
    }
}
