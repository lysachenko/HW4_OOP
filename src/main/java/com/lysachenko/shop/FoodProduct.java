package com.lysachenko.shop;

import com.lysachenko.shop.abstr.Product;
import com.lysachenko.shop.interfaces.Expirable;

import java.util.Date;

public class FoodProduct extends Product implements Expirable{

    private Date expirationDate;

    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }

    public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction, Date expirationDate) {
        super(name, price, quantity, ageRestriction);
        this.expirationDate = expirationDate;
    }

    public double getPrice() {

        long fifteenDays = 1202400000;

        if (expirationDate != null) {
            if ((expirationDate.getTime() - new Date().getTime()) < fifteenDays) {

                return super.getPrice() / 100 * 70;
            }
        }

        return super.getPrice();
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "FoodProduct{" + super.toString() +
                ", expirationDate=" + expirationDate +
                '}';
    }
}
