package interfaces;

import model.dto.Chat;
import model.dto.User;

public interface IChatService {
    void join(Chat chatRoom, User user);
    void leave(Chat chatRoom, User user);
    void sendMessage(Chat chatRoom, User sender, String content);
}
