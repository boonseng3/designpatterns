package com.obs.designpattern;

/**
 * Created by ongbo on 2/22/2017.
 */
public class MyClass implements OriginalInterface {
    private int count = 10;

    public int getCount() {
        return count;
    }

    public MyClass setCount(int count) {
        this.count = count;
        return this;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
