package com.obs.designpattern;

/**
 * Created by ongbo on 2/16/2017.
 */
public class Proxy implements Subject{

    private Subject realSubject = new SubjectImpl();
    @Override
    public void performAction() {
        System.out.println("Proxy perform action");
        realSubject.performAction();
    }
}
