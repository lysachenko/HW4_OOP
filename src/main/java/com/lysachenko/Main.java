package com.lysachenko;

import com.lysachenko.shapes.*;
import com.lysachenko.shapes.abstr.Shape;
import com.lysachenko.shop.Appliance;
import com.lysachenko.shop.Customer;
import com.lysachenko.shop.FoodProduct;
import com.lysachenko.shop.PurchaseManager;
import com.lysachenko.shop.abstr.Product;
import com.lysachenko.vertex.Vertex2D;
import com.lysachenko.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<Shape>();

        shapes.add(new Rectangle(new Vertex2D(1, 2), 5, 5));
        shapes.add(new Triangle(new Vertex2D(0, 0), new Vertex2D(0, 3), new Vertex2D(4, 0)));
        shapes.add(new Circle(new Vertex2D(1, 2), 10));
        shapes.add(new SquarePyramid(new Vertex3D(1, 2, 3), 5, 5));
        shapes.add(new Cuboid(new Vertex3D(1, 2, 3), 5, 5, 5));
        shapes.add(new Sphere(new Vertex3D(1, 2, 3), 5));

        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        List<Product> products = new ArrayList<>();
        List<FoodProduct> foodProducts = new ArrayList<>();

        Product testProduct = new FoodProduct("BestProduct", 100, 1, Product.AgeRestriction.ADULT, new Date(1593621212121L));
        Product cigars = new FoodProduct("A20 Blaze it fgt", 6.90, 1400, Product.AgeRestriction.ADULT);
        Product app = new Appliance("A1pp", 5.0, 10, Product.AgeRestriction.ADULT);
        Customer pecata = new Customer("Pecata", 17, 30.00);
        Customer gopeto = new Customer("Gopeto", 18, 0.44);
        Customer roman = new Customer("Roman", 20, 300.0);
        FoodProduct food1 = new FoodProduct("Milk", 9.40, 500, Product.AgeRestriction.NONE, new Date(1593621812121L));
        FoodProduct food2 = new FoodProduct("Juice", 34.30, 680, Product.AgeRestriction.NONE, new Date(1593621215121L));
        FoodProduct food3 = new FoodProduct("Carrot", 4.70, 1680, Product.AgeRestriction.NONE, new Date(1593621282121L));

        products.add(cigars);
        products.add(testProduct);
        products.add(app);
        products.add(food1);
        products.add(food2);
        products.add(food3);

        foodProducts.add(food1);
        foodProducts.add(food2);
        foodProducts.add(food3);

        System.out.println();

        System.out.println("Product with the soonest date of expiration: " + foodProducts.stream()
                .filter(product -> product.getExpirationDate() != null)
                .min(Comparator.comparing(FoodProduct::getExpirationDate)) + "\n");

        products.stream()
                .filter(product -> product.getAgeRestriction() == Product.AgeRestriction.ADULT)
                .sorted(Comparator.comparing(Product::getPrice))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        try {
            PurchaseManager.processPurchase(cigars, pecata);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.toString());
        }
        try {
            PurchaseManager.processPurchase(cigars, gopeto);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.toString());
        }
        try {
            PurchaseManager.processPurchase(app, roman);
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.toString());
        }

        System.out.println(app.getQuantity());
        System.out.println(roman.getBalance());
    }
}
