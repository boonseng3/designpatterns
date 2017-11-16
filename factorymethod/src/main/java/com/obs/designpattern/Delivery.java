package com.obs.designpattern;

import java.time.LocalDateTime;

public class Delivery {

    private Car car;
    private LocalDateTime dateOfDelivery;

    public Delivery(Car car, LocalDateTime dateOfDelivery) {
        this.car = car;
        this.dateOfDelivery = dateOfDelivery;
    }

    public Car getCar() {
        return car;
    }

    public LocalDateTime getDateOfDelivery() {
        return dateOfDelivery;
    }
}
