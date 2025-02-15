package br.edu.ifba.saj.ads.poo.controller;

import br.edu.ifba.saj.ads.poo.App;
import javafx.css.PseudoClass;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

public class MasterController {

    @FXML
    private BorderPane masterPane;

    @FXML
    private VBox menu;

    @FXML
    private Label userEmail;

    @FXML
    private Circle userPicture;

    @FXML
    void logOff(MouseEvent event) {
        Alert alert = new Alert(AlertType.CONFIRMATION, "Deseja realmente sair??", ButtonType.YES, ButtonType.NO);
        alert.showAndWait()
                .filter(response -> response == ButtonType.YES)
                .ifPresent(response -> {
                    App.setRoot("controller/TelaLogin.fxml");
                });
    }

    // @FXML
    // void showHome(ActionEvent event) {
    //     limparBotoes(event.getSource());
    //     masterPane.setCenter(new Pane());

    // }

    // @FXML
    // void showUsuarios(ActionEvent event) {
    //     limparBotoes(event.getSource());
    //     masterPane.setCenter(new Pane());
    // }

    // private void limparBotoes(Object source) {
    //     menu.getChildren().forEach((node) -> {
    //         if (node instanceof Button btn) {
    //             node.pseudoClassStateChanged(PseudoClass.getPseudoClass("selected"), false);                
    //         }
    //     }

    //     );
    //     if (source instanceof Button btn) {
    //         btn.pseudoClassStateChanged(PseudoClass.getPseudoClass("selected"), true);
    //     }
    // }

    // @FXML
    // void showCadAutores(ActionEvent event) {
    //     limparBotoes(event.getSource());
    //     showFXMLFile("CadAutor.fxml");
    // }
    // @FXML
    // void showListAutores(ActionEvent event) {
    //     limparBotoes(event.getSource());
    //     showFXMLFile("ListAutor.fxml");
    // }

    // @FXML
    // void showLivros(ActionEvent event) {
    //     limparBotoes(event.getSource());
    //     showFXMLFile("CadLivro.fxml");
    // }

    private void showFXMLFile(String resourceName) {
        try {            
            Pane fxmlCarregado = FXMLLoader.load(getClass().getResource(resourceName));
            masterPane.setCenter(fxmlCarregado);
        } catch (Exception e) {
            new Alert(AlertType.ERROR, "Erro ao carregar o arquivo " + resourceName).showAndWait();
            e.printStackTrace();
        }
    }

    public void setEmail(String email) {
        userEmail.setText(email);
    }
}

