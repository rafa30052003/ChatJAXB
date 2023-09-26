package model.dto;

public class Message {
        private User usuario;
        private String contenido;
        private Date fecha;

    public Message() {
    }

    public Message(String message, String contenido, Date fecha) {
        Message = message;
        Contenido = contenido;
        Fecha = fecha;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Message{" +
                "usuario=" + usuario +
                ", contenido='" + contenido + '\'' +
                ", fecha=" + fecha +
                '}';
    }

}
