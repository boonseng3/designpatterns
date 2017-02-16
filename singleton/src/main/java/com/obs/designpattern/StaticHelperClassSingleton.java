package com.obs.designpattern;

/**
 * Created by ongbo on 2/15/2017.
 * Thread safe and lazy loading.
 *
 */
public class StaticHelperClassSingleton {
    private StaticHelperClassSingleton() {
    }

    public static StaticHelperClassSingleton getInstance() {
        return StaticHelper._instance;
    }

    static class StaticHelper{
        static final StaticHelperClassSingleton _instance = new StaticHelperClassSingleton();
    }
}
