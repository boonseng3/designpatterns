package com.obs.designpattern;

/**
 * Created by ongbo on 2/22/2017.
 */
public class VisitorImpl implements Visitor {
    @Override
    public void visit(MyClass object) {
        object.setCount(100);
    }
}
