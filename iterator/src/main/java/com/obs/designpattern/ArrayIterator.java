package com.obs.designpattern;

/**
 * Created by ongbo on 2/20/2017.
 */
public class ArrayIterator implements Iterator<String> {
    private int index = 0;
    private String[] array;

    public ArrayIterator(String[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public String next() {
        return array[index++];
    }
}
