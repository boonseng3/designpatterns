package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by ongbo on 2/20/2017.
 */
public class TestFacade {
    @Test
    public void testPattern() {
        CarFacade carFacade = new CarFacade();
        String color = "Red";
        String weather = "Sunny";
        String model = "VT-100";
        // unified way to build a car instead of interacting the subsystem
        Car car = carFacade.build(color, weather, model);
        assertThat(car.getBody()).hasFieldOrPropertyWithValue("color", color);
        assertThat(car.getTyre()).hasFieldOrPropertyWithValue("weather", weather);
        assertThat(car.getEngine()).hasFieldOrPropertyWithValue("model", model);


        // Still able to build a Car by accessing the subsystem directly
        Car car2 = new Car(new Body(color), new Engine(model), new Tyre(weather));
        assertThat(car2.getBody()).hasFieldOrPropertyWithValue("color", color);
        assertThat(car2.getTyre()).hasFieldOrPropertyWithValue("weather", weather);
        assertThat(car2.getEngine()).hasFieldOrPropertyWithValue("model", model);
    }
}
