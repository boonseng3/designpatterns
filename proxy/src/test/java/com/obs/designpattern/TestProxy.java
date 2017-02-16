package com.obs.designpattern;

import org.junit.Test;

/**
 * Created by ongbo on 2/16/2017.
 */
public class TestProxy {

    @Test
    public void performAction(){
        Subject proxy = new Proxy();
        proxy.performAction();
    }
}
