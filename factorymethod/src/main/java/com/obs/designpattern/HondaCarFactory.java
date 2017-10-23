package com.obs.designpattern;

public class HondaCarFactory extends CarFactory {
    @Override
    public Car build() {
        return new HondaCar();
    }
}
