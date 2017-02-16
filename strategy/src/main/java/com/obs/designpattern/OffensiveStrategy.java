package com.obs.designpattern;

/**
 * Created by ongbo on 2/16/2017.
 */
public class OffensiveStrategy implements Strategy {
    @Override
    public String play() {
        return "attack";
    }
}
