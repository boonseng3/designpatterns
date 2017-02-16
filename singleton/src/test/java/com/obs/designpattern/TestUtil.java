package com.obs.designpattern;

import java.time.Duration;
import java.time.Instant;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Created by ongbo on 2/15/2017.
 */
public class TestUtil {

    public static Duration getDuration(Supplier supplier){
        final int round =Integer.MAX_VALUE;
        Instant start = Instant.now();
        for (int i = 0; i < round; i++) {
            supplier.get();
        }
        Instant end = Instant.now();
        return Duration.between(start, end);
    }
}
