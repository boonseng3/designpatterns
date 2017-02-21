package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


/**
 * Created by ongbo on 2/21/2017.
 */
public class PrototypeTest {
    @Test
    public void testPattern() throws Exception {

        Bike basicBike = new Bike("basic", 4);
        assertThat(basicBike).hasFieldOrPropertyWithValue("model", "basic")
                .hasFieldOrPropertyWithValue("gears", 4);

        Bike advanceBike = basicBike.makeClone().setModel("advance").setGears(6);
        assertThat(advanceBike).hasFieldOrPropertyWithValue("model", "advance")
                .hasFieldOrPropertyWithValue("gears", 6);
    }
}