package model.dto;

import java.util.List;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "chat")
@XmlAccessorType(XmlAccessType.FIELD)
public class Chat {

    @XmlElementWrapper(name = "messages")
    @XmlElement(name = "message")
    private List<Message> messages;

    public Chat() {
    }

    public Chat(List<User> users, List<Message> messages) {

        this.messages = messages;
    }



    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "messages=" + messages +
                '}';
    }
}
