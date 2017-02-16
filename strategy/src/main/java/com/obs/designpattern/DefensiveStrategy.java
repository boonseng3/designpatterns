package com.obs.designpattern;

/**
 * Created by ongbo on 2/16/2017.
 */
public class DefensiveStrategy implements Strategy {
    @Override
    public String play() {
        return "defend";
    }
}
