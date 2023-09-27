package model.service;

import model.dto.Chat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XMLService {
    // Método para serializar una sala de chat a un archivo XML
    public static void marshal(Chat chatRoom, File file) throws IOException, JAXBException {
        marshal(chatRoom, file);
    }

    // Método para serializar un objeto a un archivo XML
    public static void marshal(Object object, File file) throws IOException, JAXBException {
        JAXBContext context = JAXBContext.newInstance(object.getClass());
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            marshaller.marshal(object, writer);
        }
    }

    // Método para deserializar un archivo XML a una sala de chat
    public static Chat unmarshalChatRoom(File file) throws JAXBException {
        Chat mychats = new Chat();
        JAXBContext context = JAXBContext.newInstance(Chat.class);
        Unmarshaller um = context.createUnmarshaller();
        mychats = (Chat) um.unmarshal(file);
        return mychats;
    }

    // Método para deserializar un archivo XML a una lista de mensajes
    public static void unmarshalMessages(File file) throws JAXBException {
        // Implementa la lógica para deserializar la lista de mensajes
        // desde el archivo XML y retornarla
    }

}





