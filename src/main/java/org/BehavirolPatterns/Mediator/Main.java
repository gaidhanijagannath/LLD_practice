package org.BehavirolPatterns.Mediator;

public class Main {

    public static void main(String[] args) {

        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom, "John");
        User user2 = new ChatUser(chatRoom, "Jane");
        User user3 = new ChatUser(chatRoom, "Mike");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Hello everyone!");
    }
}