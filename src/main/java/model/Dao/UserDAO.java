package dao;

import model.dto.User;
import javax.xml.bind.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private String filePath;
    private List<User> users;

    public UserDAO(String filePath) {
        this.filePath = filePath;
        this.users = new ArrayList<>();
        loadUsersFromXML();
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserByNickname(String nickname) {
        for (User user : users) {
            if (user.getNickname().equals(nickname)) {
                return user;
            }
        }
        return null;
    }

    public void addUser(User user) {
        users.add(user);
        saveChanges();
    }

    public void saveChanges() {
        try {
            JAXBContext context = JAXBContext.newInstance(User.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(users, new File(filePath));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private void loadUsersFromXML() {
        try {
            File file = new File(filePath);
            if (file.exists()) {
                JAXBContext context = JAXBContext.newInstance(User.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();
                users = (List<User>) unmarshaller.unmarshal(file);
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
