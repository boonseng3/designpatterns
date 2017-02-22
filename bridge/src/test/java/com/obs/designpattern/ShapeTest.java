package com.obs.designpattern;

import org.junit.Test;

/**
 * Created by ongbo on 2/22/2017.
 */
public class ShapeTest {
    @Test
    public void draw() throws Exception {

        DrawingApi api1 = new DrawingApi1();
        DrawingApi api2 = new DrawingApi2();

        Shape circle1 = new CircleShape(api1);
        Shape circle2 = new CircleShape(api2);

        circle1.draw();
        circle2.draw();
    }
}