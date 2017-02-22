package com.obs.designpattern;

/**
 * Created by ongbo on 2/22/2017.
 */
public abstract class Shape {
    protected DrawingApi api;

    public Shape(DrawingApi api) {
        this.api = api;
    }

    public abstract void draw();
}
