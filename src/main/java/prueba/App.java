package prueba;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    private static Scene scene;

    public void start(Stage stage) {
        Parent root = loadFXML("login.fxml");
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Controllers/" + fxml + "login.fxml"));
            return fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException("Error al cargar el archivo FXML: " + fxml, e);
        }
    }


    public static void main(String[] args) {
        launch();
    }


}
