package model.dto;

import javax.xml.bind.annotation.*;
import java.util.Date;
import java.util.Objects;

@XmlRootElement(name = "message")
@XmlAccessorType(XmlAccessType.FIELD)
public class Message {
    @XmlElement(name = "user")
    private String user;

    @XmlElement(name = "text")
    private String sender;

    @XmlElement(name = "date")
    private Date timestamp;


    public Message(String user, String sender, Date timestamp) {
        this.user = user;
        this.sender = sender;
        this.timestamp = timestamp;
    }

    public Message() {
<<<<<<< HEAD
<<<<<<< HEAD
        // Constructor sin argumentos
    }


=======
    }

>>>>>>> 72042192358ba02c60e4a083d296e6be2afc06b6
=======
    }

>>>>>>> 3ed6c5c769d1e770fa4e3ba7838d452b5b586bfd
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
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


}