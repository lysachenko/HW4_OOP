package com.lysachenko.shapes;

import com.lysachenko.shapes.abstr.PlaneShape;
import com.lysachenko.vertex.Vertex2D;

import java.util.Collections;

public class Circle extends PlaneShape {

    private double radius;

    public Circle(Vertex2D vertex2D, double radius) {
        super(Collections.singletonList(vertex2D));
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle: " +
                super.toString() +
                ", radius = " + radius +
                ", perimeter = " + getPerimeter() +
                ", area = " + getArea() + ';';
    }
}
