package com.obs.designpattern;

/**
 * Created by ongbo on 2/21/2017.
 */
public class Director {

    public Product buildCar(String color) {
        Builder builder = new CarBuilder();
        builder.addBody(color);
        builder.addWheels(4);
        builder.addHeadlight(2);
        return builder.getProduct();
    }

    public Product buildMotorcycle(String color) {
        Builder builder = new MotorcycleBuilder();
        builder.addBody(color);
        builder.addWheels(2);
        builder.addHeadlight(1);
        return builder.getProduct();
    }
}
