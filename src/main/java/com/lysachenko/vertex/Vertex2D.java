package com.lysachenko.vertex;

public class Vertex2D implements Vertex {

    private double x;
    private double y;

    public Vertex2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getDistance(Vertex vertex2D) {
        return Math.sqrt(Math.pow((this.x - ((Vertex2D) vertex2D).getX()), 2)
                + Math.pow((this.y - ((Vertex2D) vertex2D).getY()), 2));
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

    @Override
    public String toString() {
        return "(x = " + getX() + ", y = " + getY() + ")";
    }
}
