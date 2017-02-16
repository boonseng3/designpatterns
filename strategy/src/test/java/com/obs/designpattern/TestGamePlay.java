package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by ongbo on 2/16/2017.
 */
public class TestGamePlay {
    @Test
    public void gamePlay() {
        GamePlay game = new GamePlay();
        Strategy offensiveStrategy = new OffensiveStrategy();
        Strategy defensiveStrategy = new DefensiveStrategy();

        game.setStrategy(offensiveStrategy);
        assertThat(game.play()).isEqualTo("attack");
        game.setStrategy(defensiveStrategy);
        assertThat(game.play()).isEqualTo("defend");
        game.setStrategy(offensiveStrategy);
        assertThat(game.play()).isEqualTo("attack");
    }
}
