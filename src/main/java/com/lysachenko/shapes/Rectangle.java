package com.lysachenko.shapes;

import com.lysachenko.shapes.abstr.PlaneShape;
import com.lysachenko.vertex.Vertex;
import com.lysachenko.vertex.Vertex2D;

import java.util.ArrayList;
import java.util.Collections;

public class Rectangle extends PlaneShape {

    private Vertex2D vertex2D;
    private double width;
    private double height;

    public Rectangle(Vertex2D vertex2D, double width, double height) {
        super(new ArrayList<Vertex>(Collections.singletonList(vertex2D)));
        this.vertex2D = vertex2D;
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
                "vertex = " + vertex2D +
                ", width=" + width +
                ", height=" + height +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea();
    }
}
