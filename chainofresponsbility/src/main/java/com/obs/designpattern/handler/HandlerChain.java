package com.obs.designpattern.handler;

import com.obs.designpattern.domain.Message;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ongbo on 2/22/2017.
 */
public class HandlerChain {
    private List<Handler> handlers = new ArrayList<>();
    private int index = 0;

    public HandlerChain add(Handler handler) {
        handlers.add(handler);
        return this;
    }


    public boolean process(Message message) {
        if (index < handlers.size()) {
            boolean result = handlers.get(index++).process(message, this);
            if (index == handlers.size()) {
                // reset index
                index = 0;
            }
            return result;
        } else {
            return false;
        }
    }
}
