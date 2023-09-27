package interfaces;

import model.dto.Message;
import model.dto.User;

import java.util.List;

public interface IMessageService {
    Message createMessage(User sender, String content);

    List<Message> getAllMessages();

    void saveMessagesToXML();

    void loadMessagesFromXML(String fileName);
}
