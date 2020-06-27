package com.lysachenko.shapes;

import com.lysachenko.shapes.abstr.SpaceShape;
import com.lysachenko.vertex.Vertex;
import com.lysachenko.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.Collections;

public class Cuboid extends SpaceShape {

    private Vertex3D vertex3D;
    private double width;
    private double height;
    private double depth;

    public Cuboid(Vertex3D vertex3D, double width, double height, double depth) {
        super(new ArrayList<Vertex>(Collections.singletonList(vertex3D)));
        this.vertex3D = vertex3D;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getArea() {
        return 2 * (width * height + height * depth + width * depth);
    }

    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid: " +
                "vertex = " + vertex3D +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                ", area=" + getArea() +
                ", volume=" + getVolume();
    }
}
