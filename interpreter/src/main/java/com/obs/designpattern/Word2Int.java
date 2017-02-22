package com.obs.designpattern;

/**
 * Created by ongbo on 2/22/2017.
 */
public class Word2Int implements Expression<Integer> {
    private String word;

    public Word2Int(String word) {
        this.word = word;
    }

    @Override
    public Integer interpret(Context ic) {
        return ic.getNumber(word);
    }
}
