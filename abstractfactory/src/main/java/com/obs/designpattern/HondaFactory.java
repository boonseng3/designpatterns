package com.obs.designpattern;

/**
 * Created by ongbo on 2/21/2017.
 */
public class HondaFactory implements CarAbstractFactory {
    @Override
    public Car getCar() {
        return new HondaCar();
    }
}
