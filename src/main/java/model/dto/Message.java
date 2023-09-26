package model.dto;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Message {
    @XmlElement
    private User user;

    @XmlElement
    private String sender;

    @XmlElement
    @XmlSchemaType(name = "dateTime")
    private Date timestamp;

    public Message() {
    }

    public Message(User user, String sender, Date timestamp) {
        this.user = user;
        this.sender = sender;
        this.timestamp = timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "user=" + user +
                ", sender='" + sender + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
