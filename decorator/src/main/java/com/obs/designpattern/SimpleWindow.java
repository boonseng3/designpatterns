package com.obs.designpattern;

/**
 * Created by ongbo on 2/16/2017.
 */
public class SimpleWindow implements Window {
    @Override
    public void drawWindow() {
        System.out.println("draw window");
    }

    @Override
    public String getDescription() {
        return "simple window";
    }
}
