package com.obs.designpattern;

/**
 * Created by ongbo on 2/15/2017.
 * Singleton implementation that is not thread safe. Lazy load the instance.
 */
public class SimpleSingleton {
    private static SimpleSingleton instance;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }
}
