package com.obs.designpattern;

/**
 * Created by ongbo on 2/20/2017.
 */
public class Car {
    private Body body;
    private Engine engine;
    private Tyre tyre;

    public Car(Body body, Engine engine, Tyre tyre) {
        this.body = body;
        this.engine = engine;
        this.tyre = tyre;
    }

    public Body getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyre getTyre() {
        return tyre;
    }
}
