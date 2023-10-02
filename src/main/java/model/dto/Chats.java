package model.dto;

import conexion.XMLmanager;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;



@XmlRootElement(name = "chats")
@XmlAccessorType(XmlAccessType.FIELD)
public class Chats {
    @XmlElement(name = "chat")
    private List<Chat> chats;

    // Instancia única de Chats (patrón Singleton)
    private static Chats instance;

    // Ruta del archivo XML
    private static final String XML_FILE = "chats.xml";

    // Constructor privado para evitar la creación de instancias desde fuera de la clase.
    private Chats() {
        chats = new ArrayList<>();
    }

    // Método para obtener la instancia única de Chats
    public static synchronized Chats getInstance() {
        if (instance == null) {
            instance = new Chats();
        }
        return instance;
    }

    public List<Chat> getChats() {
        return chats;
    }

    public void setChats(List<Chat> chats) {
        this.chats = chats;
    }

    // Método para añadir un chat a la lista
    public void addChat(Chat chat) {
        chats.add(chat);
        saveChats(); // Guardar la lista actualizada cuando se agrega un chat
    }

    // Método para guardar la lista en el archivo XML
    public void saveChats() {
        XMLmanager.writeXML(this, XML_FILE);
    }

    // Método para cargar la lista desde el archivo XML
    public void loadChats() {
        if (chats.isEmpty()) {
            Chats loadedChats = XMLmanager.readXML(this, XML_FILE);
            if (loadedChats != null) {
                this.chats = loadedChats.getChats();
            }
        }
    }


}
