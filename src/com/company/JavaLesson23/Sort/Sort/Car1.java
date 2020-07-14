package com.company.JavaLesson23.Sort.Sort;


import java.util.Map;
import java.util.TreeMap;


public class Car1 implements Comparable<Car1> {

    String color;
    Integer number;

    public Car1(String color, Integer number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "color='" + color + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int compareTo(Car1 o) {
        return this.number - o.number;
    }
}


class RunCar {
    public static void main(String[] args) {
        Map<Car1, Integer> carMap = new TreeMap<>(Car1::compareTo);
        carMap.put(new Car1("red", 123), 12);
        carMap.put(new Car1("green", 121), 34);
        carMap.put(new Car1("blue", 125), 66);
        carMap.put(new Car1("yellow", 124), 99);

        for (Map.Entry<Car1, Integer> carEntry : carMap.entrySet()) {
            System.out.println(carEntry.getKey() + " " + carEntry.getValue());
        }

    }
}

