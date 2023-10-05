package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import model.Dao.ChatDAO;
import model.dto.Chat;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField NameField;

    @FXML
    private ChoiceBox<String> ListaSalas;

    @FXML
    private Button loginButton;

    @FXML
    private Text mensajeBienvenida;

    private ChatDAO chatDAO; // Debes instanciar ChatDAO

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Inicialización del controlador
        // Puedes agregar código de inicialización aquí
        chatDAO = new ChatDAO(); // Inicializa ChatDAO

        // Configura las salas en el ChoiceBox (asumiendo que ya están definidas)
        configurarSalas();
    }

    // Método para manejar el evento del botón "LOGIN"
    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        String nombre = NameField.getText();
        String salaSeleccionada = ListaSalas.getValue();

        // Realiza aquí la lógica de inicio de sesión con el nombre y la sala seleccionada
        Chat chat = chatDAO.createChat(salaSeleccionada); // Crea o carga el chat según la sala seleccionada

        // Por ejemplo, podrías mostrar un mensaje de bienvenida
        mensajeBienvenida.setText("¡Bienvenido, " + nombre + " en la sala " + salaSeleccionada + "!");
    }

    // Método para configurar las salas en el ChoiceBox
    private void configurarSalas() {
        // Configura las salas en el ChoiceBox (asumiendo que ya están definidas)
        ListaSalas.getItems().addAll("Sala 1", "Sala 2", "Sala 3"); // Agrega las salas predefinidas
    }

    // Puedes agregar más métodos para manejar otros eventos o interacciones aquí

}
