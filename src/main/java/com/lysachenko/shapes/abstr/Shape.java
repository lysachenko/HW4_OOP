package com.lysachenko.shapes.abstr;

import com.lysachenko.vertex.Vertex;

import java.util.List;

public abstract class Shape {

    private List<Vertex> vertices;

    public Shape(List<Vertex> vertices) {
        this.vertices = vertices;
    }
}
