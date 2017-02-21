package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by ongbo on 2/21/2017.
 */
public class MediatorTest {
    @Test
    public void send() throws Exception {

        ChatMediator mediator = new ChatMediator();
        Peer john = new Peer(mediator, "John");
        Peer peter = new Peer(mediator, "Peter");
        Supervisor jane = new Supervisor("Jane", mediator);

        mediator.setPeer1(john);
        mediator.setPeer2(peter);
        mediator.setSupervisor(jane);

        john.send("Hi Peter.");
        assertThat(peter).hasFieldOrPropertyWithValue("message", "[John] Hi Peter.");
        assertThat(jane).hasFieldOrPropertyWithValue("message", "[John] Hi Peter.");
        peter.send("Hi John.");
        assertThat(john).hasFieldOrPropertyWithValue("message", "[Peter] Hi John.");
        assertThat(jane).hasFieldOrPropertyWithValue("message", "[Peter] Hi John.");
        jane.send("Lets meet.");
        assertThat(john).hasFieldOrPropertyWithValue("message", "[Jane] Lets meet.");
        assertThat(peter).hasFieldOrPropertyWithValue("message", "[Jane] Lets meet.");
    }
}