package com.company.JavaLesson16;


import java.util.Arrays;

public class Klient {
    private String firstName;
    private String lastNane;
    private Zakaz [] zakaz;
    private Zakaz zakaz1;

    public Klient() {
    }

    public Klient(String firstName, String lastNane) {
        this.firstName = firstName;
        this.lastNane = lastNane;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNane() {
        return lastNane;
    }

    public void setLastNane(String lastNane) {
        this.lastNane = lastNane;
    }


//    public void priceZakaz(){
//        zakaz1.priceZakaz();
//    }


    public Zakaz[] getZakaz() {
        return zakaz;
    }

    public void setZakaz(Zakaz[] zakaz) {
        this.zakaz = zakaz;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "firstName='" + firstName + '\'' +
                ", lastNane='" + lastNane + '\'' +
                ", zakaz=" + Arrays.toString(zakaz) +
                '}';
    }
}
