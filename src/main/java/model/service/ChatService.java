package model.service;

import interfaces.IChatService;
import model.dto.Chat;
import model.dto.Message;
import model.dto.User;

public class ChatService implements IChatService {
    @Override
    public void join(Chat chatRoom, User user) {
        if (!chatRoom.getUsers().contains(user)) {
            chatRoom.getUsers().add(user);
        }
    }

    @Override
    public void leave(Chat chatRoom, User user) {
        chatRoom.getUsers().remove(user);
    }

    @Override
    public void sendMessage(Chat chatRoom, User user, String sender) {
        MessageService ms = new MessageService();
        Message message = ms.createMessage(user, sender);
        chatRoom.getMessages().add(message);
    }
}
