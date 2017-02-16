package com.obs.designpattern;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static com.obs.designpattern.TestUtil.getDuration;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Java6Assertions.fail;

/**
 * Created by ongbo on 2/15/2017.
 */
public class TestSynchronizedSingleton {

    @Test
    public void singleThreadTest() {
        SynchronizedSingleton obj1 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton obj2 = SynchronizedSingleton.getInstance();
        SynchronizedSingleton obj3 = SynchronizedSingleton.getInstance();
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
        final List<Callable<SynchronizedSingleton>> tasks2 = new ArrayList<>();
        final CountDownLatch latch = new CountDownLatch(numThreads);
        try {
            for (int i = 0; i < numThreads; i++) {

                tasks2.add(new Callable<SynchronizedSingleton>() {
                    @Override
                    public SynchronizedSingleton call() throws Exception {
                        latch.countDown();
                        latch.await();
                        return SynchronizedSingleton.getInstance();
                    }
                });
            }

            threadPool.invokeAll(tasks2).stream().reduce((runnableFuture, runnableFuture2) -> {
                try {
                    if (runnableFuture.get() != runnableFuture2.get()) {
                        System.out.println("different  " + runnableFuture.get() + " != " + runnableFuture2.get());
                        fail("Different instance returned");
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

    @Test
    public void testPerformance() {

        int diff1 = getDuration(() -> SynchronizedSingleton.getInstance()).getNano();
        System.out.println("nano = " + diff1);

        int diff2 = getDuration(() -> SimpleSingleton.getInstance()).getNano();
        System.out.println("nano = " + diff2);

        assertThat(diff1).isGreaterThan(diff2);
    }
}
