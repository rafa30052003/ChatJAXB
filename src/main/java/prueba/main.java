package prueba;

import model.Dao.ChatDAO;
import model.Dao.UserDAO;
import model.dto.Chat;
import model.dto.Message;
import model.dto.User;
import model.dto.Users;

import java.util.Date;

public class main {
    public static void main(String[] args) {
        // Crear un nuevo usuario y agregarlo a la lista de usuarios
      User newUser = new User("lolo", new Date());

       // UserDAO.createUser(newUser);
        // Crear un nuevo chat
        ChatDAO chatDao = new ChatDAO();
       // Chat newChat2 = chatDao.createChat("car");
       // newChat2.startPeriodicUpdate();
        //Un usuario se une al chat
        ChatDAO cd = new ChatDAO();
        //cd.userJoinsChat(newChat, newUser.getNickname());
      // Message ms = new Message(newUser.getNickname(), "hola mundo", new Date());
       //cd.userWritesMessage(newChat, newUser, ms.getSender());


        //Message ms3 = new Message(newUser.getNickname(), "hola mundo", new Date());


       User newUser1 = new User("antonio", new Date());
        //UserDAO.createUser(newUser1);
      //  cd.userJoinsChat(newChat2, newUser1.getNickname());
       // cd.userWritesMessage(newChat2, newUser1, "hola");
      //  cd.userWritesMessage(newChat2, newUser1, "mundo");
      //  cd.userWritesMessage(newChat2, newUser1, "cruel ");
<<<<<<< HEAD
     // Chat newChat3 = chatDao.createChat("agua");
     // cd.userJoinsChat(newChat3,newUser.getNickname());
       // cd.userWritesMessage(newChat3, newUser, "hola ");
       // cd.userJoinsChat(newChat3,newUser1.getNickname());
       // cd.userWritesMessage(newChat3, newUser1, "hola ");
        //User newUser7 = new User("pedro", new Date());
        Chat newChat7 = chatDao.createChat("playa");

=======
      Chat newChat3 = chatDao.createChat("agua");
      cd.userJoinsChat(newChat3,newUser.getNickname());
        cd.userWritesMessage(newChat3, newUser, "hola ");
        cd.userJoinsChat(newChat3,newUser1.getNickname());
        cd.userWritesMessage(newChat3, newUser1, "hola ");

        User newUser7 = new User("pedro", new Date());
        Chat newChat4 = chatDao.createChat("fuego");
        cd.userJoinsChat(newChat4,newUser.getNickname());
        cd.userWritesMessage(newChat4, newUser, "hola ");
>>>>>>> 8588008d427c7d1067aa7f186e54d40b1acc69f8
    }
}

