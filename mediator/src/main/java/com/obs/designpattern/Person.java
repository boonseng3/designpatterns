package com.obs.designpattern;

/**
 * Created by ongbo on 2/21/2017.
 */
public interface Person {
    String getName();

    void send(String msg);

    void notify(String msg);

    String getMessage();
}
