package com.lysachenko.shapes;

import com.lysachenko.shapes.abstr.SpaceShape;
import com.lysachenko.vertex.Vertex;
import com.lysachenko.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.Collections;

public class Sphere extends SpaceShape {

    private Vertex3D vertex3D;
    private double radius;

    public Sphere(Vertex3D vertex3D, double radius) {
        super(new ArrayList<Vertex>(Collections.singletonList(vertex3D)));
        this.vertex3D = vertex3D;
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
                "vertex = " + vertex3D +
                ", radius=" + radius +
                ", area=" + getArea() +
                ", volume=" + getVolume();
    }
}
