package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;

public class ChatController {

    @FXML
    private MenuButton ButtonSalas;

    @FXML
    private ListView<String> ListMensajes;

    @FXML
    private TextField FieldMensaje;

    @FXML
    private Button ButtonEnviar;

    @FXML
    private void initialize() {
        // Inicializa tu controlador aquí
        // Por ejemplo, puedes configurar eventos de clic para el botón de enviar
        ButtonEnviar.setOnAction(event -> enviarMensaje());
    }

    @FXML
    private void enviarMensaje() {
        // Este método se llama cuando se hace clic en el botón de enviar
        String mensaje = FieldMensaje.getText();
        if (!mensaje.isEmpty()) {
            ListMensajes.getItems().add(mensaje);
            FieldMensaje.clear();
        }
    }
}
