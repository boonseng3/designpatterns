package com.obs.designpattern;

import java.util.*;
import java.util.Observable;

/**
 * Created by ongbo on 2/15/2017.
 */
public class JdkObserver implements java.util.Observer {
    @Override
    public void update(Observable o, Object arg) {
//        System.out.println("arg = " + arg);
    }
}
