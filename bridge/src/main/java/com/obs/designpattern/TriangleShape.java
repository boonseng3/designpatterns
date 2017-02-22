package com.obs.designpattern;

/**
 * Created by ongbo on 2/22/2017.
 */
public class TriangleShape extends Shape {
    public TriangleShape(DrawingApi api) {
        super(api);
    }

    @Override
    public void draw() {
        api.drawShape();
    }
}
