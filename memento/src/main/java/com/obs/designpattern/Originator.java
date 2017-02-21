package com.obs.designpattern;

/**
 * Created by ongbo on 2/20/2017.
 */
public class Originator {
    private String state;

    public Originator setState(String state) {
        this.state = state;
        return this;
    }

    public Memento saveToMemento() {
        return new Memento(this.state);
    }

    public void revert(Memento memento) {
        setState(memento.getState());
    }

    class Memento {
        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}
