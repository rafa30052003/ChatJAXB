package model.Dao;



import model.dto.Chat;
import model.dto.Chats;

import javax.xml.bind.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ChatDAO {
    private String filePath;
    private Chats chats; // Cambio en el tipo de objeto



    public List<Chat> getAllChats() {
        return chats.getChats(); // Obtén la lista de chats del objeto Chats
    }




    public static void createChat(Chat chat) {
        Chats chats = Chats.getInstance();
        chats.loadChats(); // Cargar chats desde el archivo XML

        if (!chatsExists(chats, chat.getChatname())) {
            chats.addChat(chat);
            chats.saveChats(); // Guardar la lista actualizada en el archivo XML
        } else {
            // Manejar el caso donde el chat con el mismo nombre ya existe
            System.out.println("El chat con el nombre '" + chat.getChatname() + "' ya existe en la lista.");
            // Puedes lanzar una excepción o mostrar un mensaje de error, según tus necesidades
        }
    }


    // Método para verificar si un usuario con el mismo nickname ya existe en la lista
    // Método para verificar si un chat con el mismo nombre ya existe en la lista de chats
    private static boolean chatsExists(Chats chats, String chatName) {
        for (Chat existingChat : chats.getChats()) {
            if (existingChat.getChatname().equals(chatName)) {
                return true; // El chat con el mismo nombre ya existe en la lista
            }
        }
        return false; // El chat no existe en la lista
    }



}
