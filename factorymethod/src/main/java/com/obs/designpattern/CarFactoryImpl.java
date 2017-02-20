package com.obs.designpattern;

/**
 * Created by ongbo on 2/20/2017.
 */
public class CarFactoryImpl extends CarFactory {
    @Override
    public Car build(String brand) {
        switch (brand) {
            case "Toyota":
                return new ToyotaCar();
            case "Honda":
                return new HondaCar();
            default:
                throw new RuntimeException("Unsupported brand");
        }
    }
}
