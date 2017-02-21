package com.obs.designpattern;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;


/**
 * Created by ongbo on 2/21/2017.
 */
public class SoldierFactoryTest {
    @Test
    public void getSoldier() throws Exception {

        SoldierFactory factory = new SoldierFactory();
        List<Deployment> deployments = new ArrayList<>();

        deployments.add(factory.getSoldier("marine").deploy(0, 0));
        assertThat(factory.getSoldiersCount()).isEqualTo(1);
        deployments.add(factory.getSoldier("marine").deploy(1, 1));
        assertThat(factory.getSoldiersCount()).isEqualTo(1);


        deployments.add(factory.getSoldier("ranger").deploy(1, 1));
        assertThat(factory.getSoldiersCount()).isEqualTo(2);
        deployments.add(factory.getSoldier("ranger").deploy(2, 2));
        assertThat(factory.getSoldiersCount()).isEqualTo(2);
        assertThat(deployments).size().isEqualTo(4);
    }
}