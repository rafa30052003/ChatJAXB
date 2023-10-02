package model.dto;

import java.util.List;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "chat") // Define el elemento raíz del XML como "chat"
@XmlType(propOrder = { "message" }) // Orden de los elementos en el XML
public class Chat {

    private Message message;

    private String chatname;

    public Message getMessage() {
        return message;
    }

    public Chat() {
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getChatname() {
        return chatname;
    }

    public void setChatname(String chatname) {
        this.chatname = chatname;
    }

    public Chat(Message message, String chatname) {
        this.message = message;
        this.chatname = chatname;
    }
}
