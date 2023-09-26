package interfaces;

import model.dto.Message;
import model.dto.User;

public interface IMessageService {
    Message createMessage(User sender, String content);
}
