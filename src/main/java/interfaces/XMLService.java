package interfaces;

public interface XMLService {
    void marshalToXML(Object object, String filePath);
    <T> T unmarshalFromXML(Class<T> clazz, String filePath);
}
