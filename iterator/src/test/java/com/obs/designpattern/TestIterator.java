package com.obs.designpattern;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ongbo on 2/20/2017.
 */
public class TestIterator {

    @Test
    public void testPattern() {
        Iterator<String> arrayItr = new ArrayIterator(new String[]{"a", "b", "c"});
        Iterator<String> listItr = new ListIterator(Arrays.asList("e", "f", "g"));

        assertThat(arrayItr.next()).isEqualTo("a");
        assertThat(arrayItr.hasNext()).isEqualTo(true);
        assertThat(arrayItr.next()).isEqualTo("b");
        assertThat(arrayItr.hasNext()).isEqualTo(true);
        assertThat(arrayItr.next()).isEqualTo("c");
        assertThat(arrayItr.hasNext()).isEqualTo(false);

        assertThat(listItr.next()).isEqualTo("e");
        assertThat(listItr.hasNext()).isEqualTo(true);
        assertThat(listItr.next()).isEqualTo("f");
        assertThat(listItr.hasNext()).isEqualTo(true);
        assertThat(listItr.next()).isEqualTo("g");
        assertThat(listItr.hasNext()).isEqualTo(false);
    }
}
