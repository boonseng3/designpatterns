package com.obs.designpattern;

/**
 * Created by ongbo on 2/22/2017.
 */
public class Int2Word implements Expression<String> {
    private Integer integer;

    public Int2Word(Integer integer) {
        this.integer = integer;
    }

    @Override
    public String interpret(Context ic) {
        return ic.getWord(integer);
    }
}
