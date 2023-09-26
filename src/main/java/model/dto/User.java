package model.dto;

public class User {

    private String name;
    private Date fecha;

    public User() {
    }


    public User(String name, Date fecha) {
        Name = name;
        Fecha = fecha;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Fecha=" + Fecha +
                '}';
    }

}
