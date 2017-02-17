package com.obs.designpattern;

/**
 * Created by ongbo on 2/17/2017.
 */
public class CalculatorAdapter {
    public double getArea(Triangle shape) {

        Calculator calculator = new Calculator();
        Rectangle rectangle = new Rectangle(shape.getBase(), 0.5*shape.getHeight());
        return calculator.getArea(rectangle);
    }
}
