package com.obs.designpattern;

/**
 * Created by ongbo on 2/15/2017.
 * Thread safe because instance get initialize early.
 * Consume memory even if the getInstance method is never invoked.
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
