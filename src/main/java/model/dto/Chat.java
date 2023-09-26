package model.dto;

import java.util.List;

public class Chat {
    private List<User> User;

    private List<Message> Message;

    public Chat() {
    }

    public Chat(List<model.dto.User> user, List<model.dto.Message> message) {
        User = user;
        Message = message;
    }

    public List<model.dto.User> getUser() {
        return User;
    }

    public void setUser(List<model.dto.User> user) {
        User = user;
    }

    public List<model.dto.Message> getMessage() {
        return Message;
    }

    public void setMessage(List<model.dto.Message> message) {
        Message = message;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "User=" + User +
                ", Message=" + Message +
                '}';
    }
}
