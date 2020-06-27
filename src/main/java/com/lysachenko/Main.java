package com.lysachenko;

import com.lysachenko.shapes.abstr.Shape;
import com.lysachenko.vertex.Vertex2D;
import com.lysachenko.vertex.Vertex3D;
import com.lysachenko.shapes.*;

import java.util.ArrayList;
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
    }
}
