package com.obs.designpattern.lambda;

import java.util.function.Consumer;

/**
 * Created by ongbo on 2/22/2017.
 * Alternative implementation using lambda
 */
public class MyClass {
    private int count = 10;

    public int getCount() {
        return count;
    }

    public MyClass setCount(int count) {
        this.count = count;
        return this;
    }

    public void accept(Consumer<MyClass> visitor) {
        visitor.accept(this);
    }
}
