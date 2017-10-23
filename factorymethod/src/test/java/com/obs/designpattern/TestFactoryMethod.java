package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ongbo on 2/20/2017.
 */
public class TestFactoryMethod {
    @Test
    public void testPattern() {
        CarFactoryDemo app = new CarFactoryDemo();
        Car car1 = app.build("Honda");
        assertThat(car1).isInstanceOf(HondaCar.class)
                .hasFieldOrPropertyWithValue("color", "Blue");
        assertThat(car1).hasFieldOrPropertyWithValue("model", "Stream");
        Car car2 = app.build("Toyota");
        assertThat(car2).isInstanceOf(ToyotaCar.class)
                .hasFieldOrPropertyWithValue("color", "Silver");
        assertThat(car2).hasFieldOrPropertyWithValue("model", "Jazz");
    }
}
