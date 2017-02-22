package com.obs.designpattern.handler;

import com.obs.designpattern.domain.Message;

/**
 * Created by ongbo on 2/22/2017.
 */
public interface Handler {

    boolean process(Message message, HandlerChain chain);
}
