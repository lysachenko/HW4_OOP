package com.lysachenko.shapes.abstr;

import com.lysachenko.vertex.Vertex;
import com.lysachenko.interfaces.AreaMeasurable;
import com.lysachenko.interfaces.VolumeMeasurable;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    private List<Vertex> vertex3DS;

    public SpaceShape(List<Vertex> vertex3DS) {
        super(vertex3DS);
        this.vertex3DS = vertex3DS;
    }
}
