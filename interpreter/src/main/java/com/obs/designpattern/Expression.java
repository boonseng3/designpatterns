package com.obs.designpattern;

/**
 * Created by ongbo on 2/22/2017.
 */
public interface Expression<T> {

    T interpret(Context ic);
}
