package com.obs.designpattern;

/**
 * Created by ongbo on 2/21/2017.
 */
public class MotorcycleBuilder implements Builder {
    private Product product = new Motorcycle();

    @Override
    public void addBody(String color) {
        product.addComponent(color + " body");
    }

    @Override
    public void addWheels(int count) {
        product.addComponent(count + " wheels");
    }

    @Override
    public void addHeadlight(int count) {
        product.addComponent(count + " headlights");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
