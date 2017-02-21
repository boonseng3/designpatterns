package com.obs.designpattern;

/**
 * Created by ongbo on 2/21/2017.
 */
public interface Builder {
    void addBody(String color);

    void addWheels(int count);

    void addHeadlight(int count);

    Product getProduct();
}
