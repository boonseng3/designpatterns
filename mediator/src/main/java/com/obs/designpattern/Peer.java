package com.obs.designpattern;

/**
 * Created by ongbo on 2/21/2017.
 */
public class Peer implements Person {
    private Mediator mediator;
    private String name;
    private String message;

    public Peer(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void send(String msg) {
        mediator.send(this, msg);
    }

    @Override
    public void notify(String msg) {
        this.message = msg;
        System.out.println("msg = " + msg);
    }

    public String getMessage() {
        return message;
    }
}
