package com.lysachenko.vertex;

public abstract class Vertex {

    private double x;
    private double y;
    private double z;

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vertex(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getDistance(Vertex vertex) {
        return Math.sqrt(Math.pow((this.x - vertex.getX()), 2)
                + Math.pow((this.y - vertex.getY()), 2)
                + Math.pow((this.z - vertex.getZ()), 2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

}
