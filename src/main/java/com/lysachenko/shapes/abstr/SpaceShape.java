package com.lysachenko.shapes.abstr;

import com.lysachenko.interfaces.AreaMeasurable;
import com.lysachenko.interfaces.VolumeMeasurable;
import com.lysachenko.vertex.Vertex;

import java.util.List;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {

    public SpaceShape(List<Vertex> vertex3DS) {
        super(vertex3DS);
    }
}
