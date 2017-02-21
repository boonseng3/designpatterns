package com.obs.designpattern;

import org.assertj.core.api.Assertions;
import org.junit.Test;


/**
 * Created by ongbo on 2/21/2017.
 */
public class CarAbstractFactoryTest {
    @Test
    public void getCar() throws Exception {

        CarAbstractFactory hondaFactory = new HondaFactory();
        CarAbstractFactory toyotaFactory = new ToyotaFactory();

        Car car1 = hondaFactory.getCar();
        Assertions.assertThat(car1).hasFieldOrPropertyWithValue("color", "Blue");
        Assertions.assertThat(car1).hasFieldOrPropertyWithValue("model", "Stream");

        Car car2 = toyotaFactory.getCar();
        Assertions.assertThat(car2).hasFieldOrPropertyWithValue("color", "Silver");
        Assertions.assertThat(car2).hasFieldOrPropertyWithValue("model", "Jazz");
    }
}