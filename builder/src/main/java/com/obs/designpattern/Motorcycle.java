package com.obs.designpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ongbo on 2/21/2017.
 */
public class Motorcycle implements Product {
    private int speedLimit = 80;
    private List<String> components = new ArrayList<>();

    @Override
    public List<String> getComponents() {
        return components;
    }

    @Override
    public void addComponent(String component) {
        components.add(component);
    }

    @Override
    public int getSpeedLimit() {
        return speedLimit;
    }
}
