package prueba;

import controller.LoginController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main2 {

    public static void main(String[] args) {


    }
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        LoginController controller = new LoginController();
        loader.setController(controller);
        Parent root = loader.load();

        primaryStage.setTitle("Aplicación de Chat en Línea");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

}
