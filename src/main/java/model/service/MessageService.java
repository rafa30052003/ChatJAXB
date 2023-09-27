package model.service;

import interfaces.IMessageService;
import model.dto.Message;

import model.dto.User;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageService implements IMessageService {
    private List<Message> messages; // Lista para almacenar los mensajes
    private final String xmlFileName; // Nombre del archivo XML para guardar y cargar mensajes
    public MessageService(String xmlFileName) {
        this.xmlFileName = xmlFileName;
        messages = new ArrayList<>();
    }

    @Override
    public Message createMessage(User user, String sender) {
        // Crea un nuevo objeto Message con el remitente y contenido proporcionados
        Message message = new Message(user,sender,  new Date() );

        // Agrega el mensaje a la lista de mensajes
        messages.add(message);

        return message;
    }

    @Override
    public List<Message> getAllMessages() {
        return messages;
    }

    @Override
    public void saveMessagesToXML() {
        try {
            File file = new File(xmlFileName);
            XMLService.marshal(messages, file);
        } catch (IOException | JAXBException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void loadMessagesFromXML(String fileName) {
        try {
            // Crear un contexto JAXB para la clase Message
            JAXBContext context = JAXBContext.newInstance(Message.class);

            // Crear un objeto Unmarshaller
            Unmarshaller unmarshaller = context.createUnmarshaller();

            // Cargar los mensajes desde el archivo XML
            List<Message> loadedMessages = (List<Message>) unmarshaller.unmarshal(new File(fileName));
            messages.clear();
            messages.addAll(loadedMessages);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}

