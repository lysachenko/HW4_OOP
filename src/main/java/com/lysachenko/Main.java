package com.lysachenko;

import com.lysachenko.shapes.*;
import com.lysachenko.shapes.abstr.Shape;
import com.lysachenko.shop.*;
import com.lysachenko.shop.abstr.Product;
import com.lysachenko.vertex.Vertex2D;
import com.lysachenko.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

        FoodProduct p = new FoodProduct("name", 100, 1, Product.AgeRestriction.ADULT, new Date(1593621212121L));

        FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, Product.AgeRestriction.ADULT);
        Customer pecata = new Customer("Pecata", 17, 30.00);
        PurchaseManager.processPurchase(cigars, pecata);
        Customer gopeto = new Customer("Gopeto", 18, 0.44);
        PurchaseManager.processPurchase(cigars, gopeto);

        Product app = new Appliance("app", 5.0, 10, Product.AgeRestriction.NONE);
        Customer roman = new Customer("Roman", 20, 300.0);
        PurchaseManager.processPurchase(app, roman);

        System.out.println(app.getQuantity());
        System.out.println(roman.getBalance());

    }
}
