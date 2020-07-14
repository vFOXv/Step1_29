package com.company.JavaLesson16;

public class Zakaz {
    private int codTovara;
    private double price;
    private double priceDelivery;


    public Zakaz() {
    }

    public Zakaz(int codTovara, double price) {
        this.codTovara = codTovara;
        this.price = price;
    }

    public int getCodTovara() {
        return codTovara;
    }

    public void setCodTovara(int codTovara) {
        this.codTovara = codTovara;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceDelivery() {
        return priceDelivery;
    }

    public void setPriceDelivery(double priceDelivery) {
        this.priceDelivery = priceDelivery;
    }

    public void priceZakaz() {
        setPriceDelivery(getPrice()*0.2);
        System.out.println("cod tovara "+getCodTovara());
        System.out.println("add price "+(getPrice() + getPriceDelivery()) );
    }
}
