package prueba;

import model.dto.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Crear algunos chats
        Chat chat1 = new Chat(new Message(Mensaje), "Chat 1");
        Chat chat2 = new Chat(new Message(Mensaje2), "Chat 2");

        // Agregar usuarios y chats a sus respectivas listas
        Chats chats = Chats.getInstance();



        chats.addChat(chat1);
        chats.addChat(chat2);

        // Cargar usuarios y chats desde el archivo XML (si es necesario)

        chats.loadChats();



        // Mostrar la lista de chats
        System.out.println("\nLista de Chats:");
        for (Chat chat : chats.getChats()) {
            System.out.println("Nombre del Chat: " + chat.getChatname());
            System.out.println("Mensaje: " + chat.getMessage());
        }
    }
}

