package com.lysachenko.shop;

import com.lysachenko.shop.abstr.Product;

import java.util.Date;

public class PurchaseManager {

    public static void processPurchase(Product product, Customer customer) {
        if (product.getQuantity() < 0) {
            throw new IllegalArgumentException("Product is out of stock!");
        }
        if (product instanceof FoodProduct) {
            if (((FoodProduct) product).getExpirationDate() != null) {
                if (((FoodProduct) product).getExpirationDate().getTime() < new Date().getTime()) {
                    throw new IllegalArgumentException("Product has expired!");
                }
            }
        }
        if (customer.getBalance() < product.getPrice()) {
            throw new IllegalArgumentException("Buyer does not have enough money!");
        }
        if (customer.getAge() < 18 && product.getAgeRestriction() == Product.AgeRestriction.ADULT) {
            throw new IllegalArgumentException("Buyer does not have permission to purchase the given product!");
        }

        product.setQuantity(product.getQuantity() - 1);
        customer.setBalance(customer.getBalance() - product.getPrice());

    }
}
