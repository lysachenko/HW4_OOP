package com.lysachenko.shapes;

import com.lysachenko.shapes.abstr.PlaneShape;
import com.lysachenko.vertex.Vertex;
import com.lysachenko.vertex.Vertex2D;

import java.util.ArrayList;
import java.util.Arrays;

public class Triangle extends PlaneShape {

    private Vertex2D v1;
    private Vertex2D v2;
    private Vertex2D v3;

    public Triangle(Vertex2D v1, Vertex2D v2, Vertex2D v3) {
        super(new ArrayList<Vertex>(Arrays.asList(v1, v2, v3)));
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getArea() {
        double halfOfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfOfPerimeter * (halfOfPerimeter - v1.getDistance(v2))
                * (halfOfPerimeter - v2.getDistance(v3))
                * (halfOfPerimeter - v3.getDistance(v1)));
    }

    public double getPerimeter() {
        return v1.getDistance(v2) + v2.getDistance(v3) + v3.getDistance(v1);
    }

    @Override
    public String toString() {
        return "Triangle: " +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea();
    }
}
