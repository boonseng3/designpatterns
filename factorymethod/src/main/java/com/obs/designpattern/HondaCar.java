package com.obs.designpattern;

/**
 * Created by ongbo on 2/20/2017.
 */
public class HondaCar implements Car {
    @Override
    public String getModel() {
        return "Stream";
    }

    @Override
    public String getColor() {
        return "Blue";
    }
}
