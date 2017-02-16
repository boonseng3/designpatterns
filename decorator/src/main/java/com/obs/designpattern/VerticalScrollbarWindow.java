package com.obs.designpattern;

/**
 * Created by ongbo on 2/16/2017.
 */
public class VerticalScrollbarWindow implements ScrollbarDecorator {
    private Window window;
    public VerticalScrollbarWindow(Window window){
        this.window=window;
    }
    @Override
    public void drawWindow() {
        window.drawWindow();
        System.out.println("draw vertical scrollbar");
    }

    @Override
    public String getDescription() {
        return new StringBuffer(window.getDescription()).append(" ").append("vertical scrollbar").toString();
    }
}
