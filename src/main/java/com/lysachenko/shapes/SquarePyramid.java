package com.lysachenko.shapes;

import com.lysachenko.shapes.abstr.SpaceShape;
import com.lysachenko.vertex.Vertex;
import com.lysachenko.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.Collections;

public class SquarePyramid extends SpaceShape {

    private Vertex3D vertex3D;
    private double width;
    private double height;

    public SquarePyramid(Vertex3D vertex3D, double width, double height) {
        super(new ArrayList<Vertex>(Collections.singletonList(vertex3D)));
        this.vertex3D = vertex3D;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return (4 * width) / 2 * ((width / (2 * Math.tan(Math.toRadians(180 / 4.0))))
                + Math.sqrt(Math.pow(height, 2) + (Math.pow(width / 2 * Math.tan(Math.toRadians(180 / 4.0)), 2))));
    }

    public double getVolume() {
        return (height * 4 * Math.pow(width, 2)) / 12 * Math.tan(Math.toRadians(180 / 4.0));
    }

    @Override
    public String toString() {
        return "SquarePyramid: " +
                "vertex = " + vertex3D +
                ", width=" + width +
                ", height=" + height +
                ", area=" + getArea() +
                ", volume=" + getVolume();
    }
}
