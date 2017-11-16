package com.obs.designpattern;

import org.junit.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ongbo on 2/20/2017.
 */
public class TestFactoryMethod {
    @Test
    public void testPattern() {
        CarFactoryDemo app = new CarFactoryDemo();
        Delivery delivery = app.build("Honda");
        Car car = delivery.getCar();

        assertThat(delivery.getDateOfDelivery()).isBeforeOrEqualTo(LocalDateTime.now());
        assertThat(car).isInstanceOf(HondaCar.class)
                .hasFieldOrPropertyWithValue("color", "Blue");
        assertThat(car).hasFieldOrPropertyWithValue("model", "Stream");

        delivery = app.build("Toyota");
        car = delivery.getCar();

        assertThat(delivery.getDateOfDelivery()).isBeforeOrEqualTo(LocalDateTime.now());
        assertThat(car).isInstanceOf(ToyotaCar.class)
                .hasFieldOrPropertyWithValue("color", "Silver");
        assertThat(car).hasFieldOrPropertyWithValue("model", "Jazz");
    }
}
