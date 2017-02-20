package com.obs.designpattern;

/**
 * Created by ongbo on 2/20/2017.
 */
public class CarFacade {
    public Car build(String color, String weather, String model) {
        return new Car(new Body(color), new Engine(model), new Tyre(weather));
    }
}
