package com.obs.designpattern;

/**
 * Created by ongbo on 2/16/2017.
 */
public class HorizontalScrollbarWindow implements ScrollbarDecorator {
    private Window window;
    public HorizontalScrollbarWindow(Window window){
        this.window=window;
    }
    @Override
    public void drawWindow() {
        window.drawWindow();
        System.out.println("draw horizontal scrollbar");
    }

    @Override
    public String getDescription() {
        return new StringBuffer(window.getDescription()).append(" ").append("horizontal scrollbar").toString();
    }
}
