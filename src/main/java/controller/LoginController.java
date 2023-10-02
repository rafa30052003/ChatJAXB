package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private TextField NameField;

    @FXML
    private ChoiceBox<String> ListaSalas;

    @FXML
    private Button loginButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Inicialización adicional, si es necesaria.
        // Puedes configurar eventos aquí, si lo deseas.

        // Ejemplo: Llenar la ChoiceBox con opciones de salas
        ListaSalas.getItems().addAll("Sala 1", "Sala 2", "Sala 3");

        // Manejar el evento de clic en el botón "LOGIN"
        loginButton.setOnAction(event -> {
            String nombre = NameField.getText();
            String salaSeleccionada = ListaSalas.getValue();

            // Aquí puedes realizar acciones basadas en los datos ingresados por el usuario,
            // como iniciar sesión o mostrar un mensaje de bienvenida.
            System.out.println("¡Hola, " + nombre + "! Has ingresado a la sala: " + salaSeleccionada);
        });
    }

    // Puedes agregar más métodos y lógica adicional aquí según tus necesidades.
}