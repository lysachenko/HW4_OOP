package com.lysachenko.shop.abstr;

public abstract class ElectronicProduct extends Product {

    private double guaranteePeriod;

    public ElectronicProduct(String name, double price, int quantity, AgeRestriction ageRestriction, double guaranteePeriod) {
        super(name, price, quantity, ageRestriction);
        this.guaranteePeriod = guaranteePeriod;
    }

    public double getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(double guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }
}
