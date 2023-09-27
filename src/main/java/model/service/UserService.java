package model.service;

import interfaces.IUserService;
import model.dto.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserService implements IUserService {
    private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    @Override
    public User joinChat(String nickname) {
        // Verificar si el apodo ya está en uso
        for (User existingUser : users) {
            if (existingUser.getNickname().equalsIgnoreCase(nickname)) {
                // El apodo ya está en uso, puedes manejarlo de acuerdo a tus requisitos (por ejemplo, mostrar un mensaje de error).
                return null;
            }
        }

        // El apodo no está en uso, crear un nuevo usuario y unirlo al chat
        User newUser = new User(nickname, new Date());
        users.add(newUser);
        return newUser;
    }
}
