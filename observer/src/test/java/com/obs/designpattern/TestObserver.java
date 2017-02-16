package com.obs.designpattern;

import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutionException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * Created by ongbo on 2/14/2017.
 */
public class TestObserver {

    /**
     * Memory leak using JDK implementation of Observer.
     * There is leak when Observer did not explicitly invoke removeObserver.
     * Even though the observer is valid of garbage collection but because the vector has a strong reference,
     * the observer will never be garbage collected.
     *
     * @throws ExecutionException
     * @throws InterruptedException
     */
    @Test
    public void oomWithJdkObservable() {
        java.util.Observable subject = new JdkObservable();
        assertThatThrownBy(() -> {
            while (true) {
                java.util.Observer observer = new JdkObserver();
                try {
                    subject.addObserver(observer);
                    subject.notifyObservers("test");
                } finally {
                    observer = null;
                }
            }
        }).hasMessage("Java heap space");
    }

    @Test
    public void customObserver() {
        com.obs.designpattern.Observable subject = new com.obs.designpattern.ObservableImpl();
        Instant start = Instant.now();
        while (true) {
            com.obs.designpattern.Observer observer = new com.obs.designpattern.ObserverImpl();
            try {
                subject.addObserver(observer);
                subject.notifyObservers("test");
                Instant end = Instant.now();
                if (Duration.between(start, end).getSeconds() >= 300) {
                    break;
                }
            } finally {
                observer = null;
            }
        }
    }

}
