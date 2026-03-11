package org.BehavirolPatterns.Mediator;

class ChatUser extends User {

    public ChatUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    void receive(String message) {
        System.out.println(this.name + " receives: " + message);
    }
}