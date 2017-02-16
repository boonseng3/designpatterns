package com.obs.designpattern;

/**
 * Created by ongbo on 2/14/2017.
 */
public interface Observable {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObservers(Object object);
}
