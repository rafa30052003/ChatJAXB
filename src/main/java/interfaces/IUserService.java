package interfaces;

import model.dto.User;

public interface IUserService {
    User joinChat(String nickname);
}
