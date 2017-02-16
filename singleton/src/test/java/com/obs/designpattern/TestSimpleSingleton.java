package com.obs.designpattern;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by ongbo on 2/15/2017.
 */
public class TestSimpleSingleton {

    @Test
    public void singleThreadTest() {
        SimpleSingleton obj1 = SimpleSingleton.getInstance();
        SimpleSingleton obj2 = SimpleSingleton.getInstance();
        SimpleSingleton obj3 = SimpleSingleton.getInstance();
        assertThat(obj1).isEqualTo(obj2);
        assertThat(obj1).isEqualTo(obj3);
    }


    /**
     * This test need to be run manually. Unable to automate as there is no reliable way to ensure concurrent access.
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    public void multipleThreadTest() throws ExecutionException, InterruptedException {
        final int numThreads = 10;
        final ExecutorService threadPool = Executors.newFixedThreadPool(numThreads);
        final List<Callable<SimpleSingleton>> tasks2 = new ArrayList<>();
        final CountDownLatch latch = new CountDownLatch(numThreads);
        try {
            for (int i = 0; i < numThreads; i++) {

                tasks2.add(new Callable<SimpleSingleton>() {
                    @Override
                    public SimpleSingleton call() throws Exception {
                        latch.countDown();
                        latch.await();
                        return SimpleSingleton.getInstance();
                    }
                });
            }

            threadPool.invokeAll(tasks2).stream().reduce((runnableFuture, runnableFuture2) -> {
                try {
                    if (runnableFuture.get() != runnableFuture2.get()) {
                        System.out.println("different  " + runnableFuture.get() + " != " + runnableFuture2.get());
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
                return runnableFuture2;
            });
        } finally {
            threadPool.shutdownNow();
        }
    }
}
