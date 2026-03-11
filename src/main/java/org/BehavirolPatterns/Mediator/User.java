package org.BehavirolPatterns.Mediator;

abstract class User {

    /*Every chat user needs the mediator*/
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    abstract void send(String message);
    abstract void receive(String message);
}