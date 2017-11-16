package com.obs.designpattern;

import java.time.LocalDateTime;

/**
 * Created by ongbo on 2/20/2017.
 */
public abstract class CarFactory {
    public abstract Car build();

    public Delivery deliver() {
        // Logic that abstract class wants to control
        return new Delivery(build(), LocalDateTime.now());
    }

}
