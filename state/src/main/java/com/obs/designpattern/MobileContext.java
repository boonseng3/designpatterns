package com.obs.designpattern;

/**
 * Created by ongbo on 2/21/2017.
 */
public class MobileContext {
    private MobileState state;

    public MobileContext(MobileState state) {
        this.state = state;
    }

    public MobileState getState() {
        return state;
    }

    public MobileContext setState(MobileState state) {
        this.state = state;
        return this;
    }

    public int getVolume() {
        return state.getVolume();
    }
}
