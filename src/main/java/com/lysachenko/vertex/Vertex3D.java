package com.lysachenko.vertex;

public class Vertex3D extends Vertex2D implements Vertex {

    private double z;

    public Vertex3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double getDistance(Vertex vertex3D) {
        return Math.sqrt(Math.pow((getX() - ((Vertex3D) vertex3D).getX()), 2)
                + Math.pow((getY() - ((Vertex3D) vertex3D).getY()), 2)
                + Math.pow((getZ() - ((Vertex3D) vertex3D).getZ()), 2));
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(x = " + getX() + ", y = " + getY() + ", z = " + getZ() + ")";
    }
}
