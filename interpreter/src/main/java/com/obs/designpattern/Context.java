package com.obs.designpattern;

/**
 * Created by ongbo on 2/22/2017.
 */
public class Context {

    public String getWord(int i) {
        switch (i) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            default:
                throw new UnsupportedOperationException();
        }
    }

    public int getNumber(String word) {
        switch (word) {
            case "zero":
                return 0;
            case "one":
                return 1;
            case "two":
                return 2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
