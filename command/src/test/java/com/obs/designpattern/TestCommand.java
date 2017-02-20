package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by ongbo on 2/20/2017.
 */
public class TestCommand {

    @Test
    public void testClient() {
        Receiver receiver = new Receiver();
        RedoCommand redo = new RedoCommand(receiver, "abc");
        UndoCommand undo = new UndoCommand(receiver, "abc");
        Invoker invoker = new Invoker();

        assertThat(invoker.invoke(redo)).isEqualTo("redo abc");
        assertThat(invoker.invoke(undo)).isEqualTo("undo abc");
    }
}
