package com.lysachenko.shapes;

import com.lysachenko.shapes.abstr.SpaceShape;
import com.lysachenko.vertex.Vertex3D;

import java.util.Collections;

public class Sphere extends SpaceShape {

    private double radius;

    public Sphere(Vertex3D vertex3D, double radius) {
        super(Collections.singletonList(vertex3D));
        this.radius = radius;
    }

    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return "Sphere: " +
                super.toString() +
                ", radius = " + radius +
                ", area = " + getArea() +
                ", volume = " + getVolume() + ';';
    }
}
