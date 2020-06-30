package com.lysachenko.shapes;

import com.lysachenko.shapes.abstr.PlaneShape;
import com.lysachenko.vertex.Vertex2D;

import java.util.Arrays;

public class Triangle extends PlaneShape {

    public Triangle(Vertex2D v1, Vertex2D v2, Vertex2D v3) {
        super(Arrays.asList(v1, v2, v3));
    }

    public double getArea() {

        double halfOfPerimeter = getPerimeter() / 2;
        double sumOfDifferenceOfSquares = 0;
        int zeroIndex = 0;
        for (int i = 0; i < getVertices().size(); i++) {
            if (i < getVertices().size() - 1) {
                sumOfDifferenceOfSquares += (halfOfPerimeter - (getVertices().get(i)).getDistance((getVertices().get(i + 1))));
            } else {
                sumOfDifferenceOfSquares += (halfOfPerimeter - (getVertices().get(i)).getDistance((getVertices().get(zeroIndex))));
            }
        }
        return Math.sqrt(halfOfPerimeter * sumOfDifferenceOfSquares);
    }

    public double getPerimeter() {

        double res = 0;
        int zeroIndex = 0;
        for (int i = 0; i < getVertices().size(); i++) {
            if (i < getVertices().size() - 1) {
                res += (getVertices().get(i)).getDistance((getVertices().get(i + 1)));
            } else {
                res += (getVertices().get(i)).getDistance((getVertices().get(zeroIndex)));
            }
        }

        return res;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                super.toString() +
                ", perimeter = " + getPerimeter() +
                ", area = " + getArea() + ';';
    }
}
