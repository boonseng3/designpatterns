package com.obs.designpattern;

import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;


/**
 * Created by ongbo on 2/21/2017.
 */
public class MobileContextTest {
    @Test
    public void getVolume() throws Exception {
        MobileContext mobileContext = new MobileContext(new RingingState());
        assertThat(mobileContext.getVolume()).isEqualTo(100);

        mobileContext.setState(new RingingWithVibrateState());
        assertThat(mobileContext.getVolume()).isEqualTo(80);

        mobileContext.setState(new SlientState());
        assertThat(mobileContext.getVolume()).isEqualTo(0);
    }
}