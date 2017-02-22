package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ongbo on 2/22/2017.
 */
public class VisitorImplTest {
    @Test
    public void visit() throws Exception {

        MyClass myClass = new MyClass();
        Visitor visitor = new VisitorImpl();
        assertThat(myClass).hasFieldOrPropertyWithValue("count", 10);
        visitor.visit(myClass);
        assertThat(myClass).hasFieldOrPropertyWithValue("count", 100);
    }
}