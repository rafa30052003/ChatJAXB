package model.dto;

public class Chat {
    private List User;

    private List Message;

    public Chat() {
    }

    public Chat(List user, List message) {
        User = user;
        Message = message;
    }
    public List getUser() {
        return User;
    }

    public void setUser(List user) {
        User = user;
    }

    public List getMessage() {
        return Message;
    }

    public void setMessage(List message) {
        Message = message;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Chat{" +
                "User=" + User +
                ", Message=" + Message +
                '}';
    }
}
