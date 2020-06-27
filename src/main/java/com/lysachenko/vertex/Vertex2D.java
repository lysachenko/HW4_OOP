package com.lysachenko.vertex;

public class Vertex2D extends Vertex {

    public Vertex2D(double x, double y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "(x = " + super.getX() + ", y = " + super.getY() + ")";
    }
}
