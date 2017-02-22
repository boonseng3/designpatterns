package com.obs.designpattern.domain;

/**
 * Created by ongbo on 2/22/2017.
 */
public class FaxMessage implements Message {
    private String number;
    private String message;

    public FaxMessage(String message, String number) {
        this.number = number;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
