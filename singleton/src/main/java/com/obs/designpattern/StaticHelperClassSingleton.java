package com.obs.designpattern;

/**
 * Created by ongbo on 2/15/2017.
 * Thread safe and lazy loading.
 * Initialization-on-demand holder idiom
 * https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
 *
 */
public class StaticHelperClassSingleton {
    private StaticHelperClassSingleton() {
        System.out.println("instantiate  StaticHelperClassSingleton");
    }

    public static StaticHelperClassSingleton getInstance() {
        return StaticHelper._instance;
    }

    static class StaticHelper{
        static final StaticHelperClassSingleton _instance = new StaticHelperClassSingleton();
    }
}
