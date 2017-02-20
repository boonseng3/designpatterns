package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ongbo on 2/20/2017.
 */
public class TestFactoryMethod {
    @Test
    public void testPattern() {
        CarFactory factory = new CarFactoryImpl();
        Car car1 = factory.build("Honda");
        assertThat(car1).hasFieldOrPropertyWithValue("color", "Blue");
        assertThat(car1).hasFieldOrPropertyWithValue("model", "Stream");
        Car car2 = factory.build("Toyota");
        assertThat(car2).hasFieldOrPropertyWithValue("color", "Silver");
        assertThat(car2).hasFieldOrPropertyWithValue("model", "Jazz");
    }
}
