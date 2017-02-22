package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ongbo on 2/22/2017.
 */
public class ContextTest {
    @Test
    public void getWord() throws Exception {

        Context interpreter = new Context();
        Expression<String> int2Word = new Int2Word(1);
        Expression<Integer> word2Int = new Word2Int("two");

        assertThat(int2Word.interpret(interpreter)).isEqualTo("one");
        assertThat(word2Int.interpret(interpreter)).isEqualTo(2);
    }
}