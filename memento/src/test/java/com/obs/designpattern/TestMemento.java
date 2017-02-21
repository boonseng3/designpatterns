package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by ongbo on 2/21/2017.
 */
public class TestMemento {

    @Test
    public void testPattern() {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("state 1");
        assertThat(originator.saveToMemento()).hasFieldOrPropertyWithValue("state", "state 1");
        caretaker.save(originator.saveToMemento());
        assertThat(caretaker.getMemento()).hasFieldOrPropertyWithValue("state", "state 1");
        originator.setState("state 2");
        assertThat(originator.saveToMemento()).hasFieldOrPropertyWithValue("state", "state 2");
        originator.revert(caretaker.getMemento());
        assertThat(originator.saveToMemento()).hasFieldOrPropertyWithValue("state", "state 1");
    }
}
