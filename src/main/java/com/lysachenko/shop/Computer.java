package com.lysachenko.shop;

import com.lysachenko.shop.abstr.ElectronicProduct;

public class Computer extends ElectronicProduct {

    public Computer(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction, 24);
    }

    @Override
    public double getPrice() {
        if (super.getQuantity() > 1000) {
            return super.getPrice() / 100 * 95;
        }
        return super.getPrice();
    }
}
