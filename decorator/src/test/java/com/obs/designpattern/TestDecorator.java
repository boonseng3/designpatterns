package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by ongbo on 2/16/2017.
 */
public class TestDecorator {
    @Test
    public void draw() {
        Window window1 = new SimpleWindow();
        window1.drawWindow();
        assertThat(window1).hasFieldOrPropertyWithValue("description", "simple window");

        Window window2 = new HorizontalScrollbarWindow(window1);
        window2.drawWindow();
        assertThat(window2).hasFieldOrPropertyWithValue("description", "simple window horizontal scrollbar");

        Window window3 = new VerticalScrollbarWindow(window1);
        window3.drawWindow();
        assertThat(window3).hasFieldOrPropertyWithValue("description", "simple window vertical scrollbar");

        Window window4 = new VerticalScrollbarWindow(new HorizontalScrollbarWindow(window1));
        window4.drawWindow();
        assertThat(window4).hasFieldOrPropertyWithValue("description", "simple window horizontal scrollbar vertical scrollbar");
    }
}
