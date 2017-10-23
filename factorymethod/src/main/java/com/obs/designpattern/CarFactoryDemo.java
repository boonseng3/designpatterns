package com.obs.designpattern;

/**
 * Created by ongbo on 2/20/2017.
 */
public class CarFactoryDemo {
    public Car build(String brand) {
        CarFactory factory;
        switch (brand) {
            case "Toyota":
                factory = new ToyotaCarFactory();
                break;
            case "Honda":
                factory = new HondaCarFactory();
                break;
            default:
                throw new RuntimeException("Unsupported brand");
        }

        return factory.build();
    }
}
