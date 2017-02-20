package com.obs.designpattern;

/**
 * Created by ongbo on 2/20/2017.
 */
public class Invoker {
    public String invoke(Command command) {
        return command.execute();
    }
}
