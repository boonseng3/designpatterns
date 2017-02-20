package com.obs.designpattern;

/**
 * Created by ongbo on 2/20/2017.
 */
public class Receiver {
    public String redo(String parameter) {
        return "redo " + parameter;
    }

    public String undo(String parameter) {
        return "undo " + parameter;
    }
}
