package com.obs.designpattern;

/**
 * Created by ongbo on 2/21/2017.
 */
public class Supervisor implements Person {

    private String name;
    private Mediator mediator;
    private String message;

    public Supervisor(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
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

    @Override
    public String getMessage() {
        return message;
    }
}
