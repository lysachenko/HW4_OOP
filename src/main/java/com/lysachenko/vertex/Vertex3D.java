package com.lysachenko.vertex;

public class Vertex3D extends Vertex {

    public Vertex3D(double x, double y, double z) {
        super(x, y, z);
    }

    @Override
    public String toString() {
        return "(x = " + super.getX() + ", y = " + super.getY() + ", z = " + super.getZ() + ")";
    }
}
