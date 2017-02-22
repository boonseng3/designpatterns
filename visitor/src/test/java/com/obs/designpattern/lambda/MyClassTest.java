package com.obs.designpattern.lambda;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ongbo on 2/22/2017.
 */
public class MyClassTest {
    @Test
    public void setCount() throws Exception {
        MyClass myClass = new MyClass();
        assertThat(myClass).hasFieldOrPropertyWithValue("count", 10);

        myClass.accept(myClass1 -> myClass1.setCount(100));
        assertThat(myClass).hasFieldOrPropertyWithValue("count", 100);
    }
}