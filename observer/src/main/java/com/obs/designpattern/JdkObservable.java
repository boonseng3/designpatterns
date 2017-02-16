package com.obs.designpattern;

/**
 * Created by ongbo on 2/15/2017.
 */
public class JdkObservable extends java.util.Observable {
    public void notifyObservers(Object arg) {
        setChanged();
        super.notifyObservers(arg);
    }
    public void notifyObservers() {
        setChanged();
        super.notifyObservers();
    }
}
