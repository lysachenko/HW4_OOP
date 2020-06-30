package com.lysachenko.shapes;

import com.lysachenko.shapes.abstr.PlaneShape;
import com.lysachenko.vertex.Vertex2D;

import java.util.Collections;

public class Rectangle extends PlaneShape {

    private double width;
    private double height;

    public Rectangle(Vertex2D vertex2D, double width, double height) {
        super(Collections.singletonList(vertex2D));
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width * height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                super.toString() +
                ", width = " + width +
                ", height = " + height +
                ", perimeter = " + getPerimeter() +
                ", area = " + getArea() + ';';
    }
}
