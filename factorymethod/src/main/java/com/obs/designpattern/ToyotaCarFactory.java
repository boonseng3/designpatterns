package com.obs.designpattern;

public class ToyotaCarFactory extends CarFactory {
    @Override
    public Car build() {
        return new ToyotaCar();
    }
}
