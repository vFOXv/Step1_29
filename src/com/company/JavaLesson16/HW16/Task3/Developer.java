package com.company.JavaLesson16.HW16.Task3;

public class Developer extends Profession {
    private String developer;

    public Developer(){ }

    public Developer(String name, String industry, String developer) {
        super(name, industry);
        this.developer = developer;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    @Override
    public void makeWork() {
        System.out.println("Make work!/Developer");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Profession{" +
                "name='" + getName() + '\'' +
                ", industry='" + getIndustry() + '\'' +
                " Developer{" +
                "developer='" + developer + '\'' +
                '}'+'}';
    }
}
