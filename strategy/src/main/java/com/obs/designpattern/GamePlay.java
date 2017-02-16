package com.obs.designpattern;

/**
 * Created by ongbo on 2/16/2017.
 */
public class GamePlay {
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public GamePlay setStrategy(Strategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public String play() {
        return strategy.play();
    }
}
