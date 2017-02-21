package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


/**
 * Created by ongbo on 2/21/2017.
 */
public class DirectorTest {

    Director director = new Director();

    @Test
    public void buildCar() throws Exception {
        Product product = director.buildCar("blue");
        assertThat(product.getComponents()).containsExactly("blue body", "4 wheels", "2 headlights");
    }

    @Test
    public void buildMotorcycle() throws Exception {
        Product product = director.buildMotorcycle("red");
        assertThat(product.getComponents()).containsExactly("red body", "2 wheels", "1 headlights");
    }
}