package com.obs.designpattern;

/**
 * Created by ongbo on 2/20/2017.
 */
public class RedoCommand implements Command {
    private Receiver receiver;
    private String parameter;

    public RedoCommand(Receiver receiver, String parameter) {
        this.receiver = receiver;
        this.parameter = parameter;
    }

    @Override
    public String execute() {
        return receiver.redo(parameter);
    }
}
