package com.lysachenko.shop;

import com.lysachenko.shop.abstr.ElectronicProduct;

public class Appliance extends ElectronicProduct {

    public Appliance(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction, 6);
    }

    @Override
    public double getPrice() {
        if (super.getQuantity() < 50) {
            return super.getPrice() / 100 * 105;
        }
        return super.getPrice();
    }
}
