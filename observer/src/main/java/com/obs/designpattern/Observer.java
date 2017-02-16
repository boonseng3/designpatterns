package com.obs.designpattern;

/**
 * Created by ongbo on 2/14/2017.
 */
public interface Observer {

    void update(Object arg);
    void update(Observable observable, Object arg);
}
