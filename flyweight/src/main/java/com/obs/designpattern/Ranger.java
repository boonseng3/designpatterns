package com.obs.designpattern;

/**
 * Created by ongbo on 2/21/2017.
 */
public class Ranger implements Soldier {
    @Override
    public Deployment deploy(int x, int y) {
        return new Deployment(x, y);
    }
}
