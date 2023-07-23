package com.devsuperior.Frete.entities;

public class Order {
    private int code;
    private double basicPrice;
    private double discount;

    public Order(int code, double basicPrice, double discount) {
        this.code = code;
        this.basicPrice = basicPrice;
        this.discount = discount;
    }

    public int getCode() {

        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
