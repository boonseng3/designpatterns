package com.obs.designpattern;

import java.util.List;

/**
 * Created by ongbo on 2/21/2017.
 */
public interface Product {
    List<String> getComponents();

    void addComponent(String component);

    int getSpeedLimit();
}
