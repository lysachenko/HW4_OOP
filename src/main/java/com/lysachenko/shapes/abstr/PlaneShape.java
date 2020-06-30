package com.lysachenko.shapes.abstr;

import com.lysachenko.vertex.Vertex;
import com.lysachenko.interfaces.AreaMeasurable;
import com.lysachenko.interfaces.PerimeterMeasurable;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    public PlaneShape(List<Vertex> vertex2DS) {
        super(vertex2DS);
    }
}
