package model.dto;

import conexion.XMLmanager;
import services.ChatUpdater;
<<<<<<< HEAD
=======
import services.ConfigManager;
>>>>>>> 3ed6c5c769d1e770fa4e3ba7838d452b5b586bfd

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "chat")
<<<<<<< HEAD

@XmlType(propOrder = { "chatname", "message" })

@XmlAccessorType(XmlAccessType.FIELD)

=======
@XmlAccessorType(XmlAccessType.FIELD)
>>>>>>> 3ed6c5c769d1e770fa4e3ba7838d452b5b586bfd
public class Chat {
    @XmlElement(name = "messages")
    private List<Message> messages;
    @XmlElement(name = "users")
    private List<User> users;
    @XmlElement(name = "name")
    private String chatname;
    @XmlElement(name = "filename") // Campo para almacenar el nombre de archivo
    private String filename;

    private static Chat instance;

    private Chat() {
        messages = new ArrayList<>();
        users = new ArrayList<>();
        chatname = "";
        filename = "";
    }

    public static synchronized Chat getInstance() {
        if (instance == null) {
            instance = new Chat();
        }
        return instance;
<<<<<<< HEAD
    }

    public List<Message> getMessages() {
        return messages;
    }

=======
    }
    String path = ConfigManager.readSharedFolderPath();
    public List<Message> getMessages() {
        return messages;
    }

>>>>>>> 3ed6c5c769d1e770fa4e3ba7838d452b5b586bfd
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getChatname() {
        return chatname;
    }

    public void setChatname(String chatname) {
        this.chatname = chatname;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public static void setInstance(Chat instance) {
        Chat.instance = instance;
    }

    public void saveChat() {
        if (filename.isEmpty()) {
            // Si el nombre de archivo está vacío, genera un nombre de archivo único
            filename = "xml/"+generateUniqueFileName();
        }
        XMLmanager.writeXML(this, filename);
    }

    public void loadChat() {
        if (!filename.isEmpty()) {
            Chat loadedChat = XMLmanager.readXML(this, filename);
            if (loadedChat != null) {
                // Cargar los datos del chat desde el archivo especificado
                // ...
            }
        }
    }

    private String generateUniqueFileName() {
        // Usar el nombre del chat como parte del nombre de archivo
<<<<<<< HEAD
        return "chat_" + chatname + ".xml";
=======
        return path + "chat_" + chatname + ".xml";
>>>>>>> 3ed6c5c769d1e770fa4e3ba7838d452b5b586bfd
    }

    public void startPeriodicUpdate() {
        Timer timer = new Timer();
        long delay = 0; // Tiempo de espera antes de la primera ejecución
        long period = 10000; // Intervalo de ejecución en milisegundos (10 segundos)

        // Programar la ejecución periódica de la actualización del chat
        timer.scheduleAtFixedRate(new ChatUpdater(this), delay, period);
    }
}
