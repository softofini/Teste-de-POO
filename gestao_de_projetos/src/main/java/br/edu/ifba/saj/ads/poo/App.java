package br.edu.ifba.saj.ads.poo;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static FXMLLoader loader;

    @Override
    public void start(Stage stage) throws IOException {
        loader = new FXMLLoader(App.class.getResource("controller/TelaLogin.fxml"));
        scene = new Scene(loader.load(), 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static Object getController() {
        return loader.getController();
    }

    public static void setRoot(String fxml) {
        scene.setRoot(loadFXML(fxml));
    }

    public static Parent loadFXML(String fxml) {
        try {
            loader = new FXMLLoader(App.class.getResource(fxml));
            Parent parent = loader.load();
            Object controller = loader.getController();
            if (controller != null) {
                parent.getProperties().put("controller", loader.getController());
            }
            return parent;
        } catch (Exception e) {
            new Alert(AlertType.ERROR, "Erro ao carregar o arquivo " + fxml).show();
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        launch();
    }

}
