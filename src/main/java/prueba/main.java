package prueba;

import model.Dao.UserDAO;
import model.dto.User;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        User user1 = new User("pepe", new Date());
        User user2 = new User("juan",  new Date());
        User user3 = new User("juan",  new Date());
        User user4 = new User("pepe",  new Date());
       // UserDAO.createUser(user1);
        UserDAO.createUser(user2);
        UserDAO.createUser(user4);


        // Imprimimos la lista de usuarios


    }
}
