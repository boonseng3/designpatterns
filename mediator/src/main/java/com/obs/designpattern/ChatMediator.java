package com.obs.designpattern;

/**
 * Created by ongbo on 2/21/2017.
 */
public class ChatMediator implements Mediator {
    private Peer peer1;
    private Peer peer2;
    private Supervisor supervisor;

    public ChatMediator setPeer1(Peer peer1) {
        this.peer1 = peer1;
        return this;
    }

    public ChatMediator setPeer2(Peer peer2) {
        this.peer2 = peer2;
        return this;
    }

    public ChatMediator setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
        return this;
    }

    @Override
    public void send(Person source, String msg) {

        if (source == peer1) {
            peer2.notify(getPrefix(source) + msg);
            // supervisor is notified when any peer send message
            supervisor.notify(getPrefix(source) + msg);
        } else if (source == peer2) {
            peer1.notify(getPrefix(source) + msg);
            // supervisor is notified when any peer send message
            supervisor.notify(getPrefix(source) + msg);
        } else {
            // if source is supervisor, send to all peers
            peer1.notify(getPrefix(source) + msg);
            peer2.notify(getPrefix(source) + msg);
        }
    }

    private String getPrefix(Person source) {
        return new StringBuffer("[").append(source.getName()).append("] ").toString();
    }
}
