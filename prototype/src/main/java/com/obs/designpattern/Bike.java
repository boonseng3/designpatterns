package com.obs.designpattern;

/**
 * Created by ongbo on 2/21/2017.
 */
public class Bike implements Cloneable<Bike> {
    private String model;
    private int gears;

    public Bike(String model, int gears) {
        this.model = model;
        this.gears = gears;
    }

    @Override
    public Bike makeClone() {
        return new Bike(model, gears);
    }

    public String getModel() {
        return model;
    }

    public int getGears() {
        return gears;
    }

    public Bike setModel(String model) {
        this.model = model;
        return this;
    }

    public Bike setGears(int gears) {
        this.gears = gears;
        return this;
    }
}
