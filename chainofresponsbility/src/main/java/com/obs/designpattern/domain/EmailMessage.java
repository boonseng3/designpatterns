package com.obs.designpattern.domain;

/**
 * Created by ongbo on 2/22/2017.
 */
public class EmailMessage implements Message {
    private String email;
    private String message;

    public EmailMessage(String message, String email) {
        this.email = email;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
