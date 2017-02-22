package com.obs.designpattern.handler;

import com.obs.designpattern.domain.EmailMessage;
import com.obs.designpattern.domain.Message;

/**
 * Created by ongbo on 2/22/2017.
 */
public class EmailHandler implements Handler {
    @Override
    public boolean process(Message message, HandlerChain chain) {
        if (message instanceof EmailMessage) {
            System.out.println("Email handler process email message");
            return true;
        } else {
            System.out.println("Pass to next handler");
            return chain.process(message);
        }
    }
}
