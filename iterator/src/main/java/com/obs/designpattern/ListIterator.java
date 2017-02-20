package com.obs.designpattern;

import java.util.List;

/**
 * Created by ongbo on 2/20/2017.
 */
public class ListIterator implements Iterator<String> {
    private int index = 0;
    private List<String> list;
    private java.util.Iterator<String> itr;

    public ListIterator(List<String> list) {
        this.list = list;
        this.itr = list.iterator();
    }

    @Override
    public boolean hasNext() {
        return itr.hasNext();
    }

    @Override
    public String next() {
        return itr.next();
    }
}
