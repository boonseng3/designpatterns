package com.obs.designpattern;

/**
 * Created by ongbo on 2/20/2017.
 */
public class Caretaker {

    private Originator.Memento memento;

    public void save(Originator.Memento memento) {
        this.memento = memento;
    }

    public Originator.Memento getMemento() {
        return memento;
    }
}
