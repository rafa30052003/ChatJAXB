package interfaces;

public interface IXMLService {
    void marshalToXML(Object object, String filePath);
    <T> T unmarshalFromXML(Class<T> clazz, String filePath);
}
