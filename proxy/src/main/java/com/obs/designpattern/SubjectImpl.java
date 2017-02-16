package com.obs.designpattern;

/**
 * Created by ongbo on 2/16/2017.
 */
public class SubjectImpl implements Subject {
    @Override
    public void performAction() {
        System.out.println("Concrete class perform action");
    }
}
