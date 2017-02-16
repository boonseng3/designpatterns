package com.obs.designpattern;

import java.util.Observable;

/**
 * Created by ongbo on 2/15/2017.
 */
public class JdkObserver implements java.util.Observer {

    // variable used to make this object consume more memory so that OOM will be reflected faster if there is memory leak
    private String[][] overhead = new String[10000][10000];

    @Override
    public void update(Observable o, Object arg) {
//        System.out.println("arg = " + arg);
    }
}
