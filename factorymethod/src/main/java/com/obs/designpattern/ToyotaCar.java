package com.obs.designpattern;

/**
 * Created by ongbo on 2/20/2017.
 */
public class ToyotaCar implements Car {
    @Override
    public String getModel() {
        return "Jazz";
    }

    @Override
    public String getColor() {
        return "Silver";
    }
}
