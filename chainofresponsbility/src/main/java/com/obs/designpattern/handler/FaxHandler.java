package com.obs.designpattern.handler;

import com.obs.designpattern.domain.FaxMessage;
import com.obs.designpattern.domain.Message;

/**
 * Created by ongbo on 2/22/2017.
 */
public class FaxHandler implements Handler {
    @Override
    public boolean process(Message message, HandlerChain chain) {
        if (message instanceof FaxMessage) {
            System.out.println("Fax handler process fax message");
            return true;
        } else {
            System.out.println("Pass to next handler");
            return chain.process(message);
        }
    }
}
