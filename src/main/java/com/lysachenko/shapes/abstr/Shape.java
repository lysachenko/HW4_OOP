package com.lysachenko.shapes.abstr;

import com.lysachenko.vertex.Vertex;

import java.util.List;

public abstract class Shape {

    private List<Vertex> vertices;

    public Shape(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertex> vertices) {
        this.vertices = vertices;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("vertices[ ");
        for (int i = 0; i < vertices.size(); i++) {
            res.append("v").append(i + 1).append(vertices.get(i)).append(" ");
        }
        res.append("]");
        return res.toString();
    }
}
