package br.edu.ifba.saj.ads.poo.controller;



import br.edu.ifba.saj.ads.poo.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    void switchToPrimary() {
        App.setRoot("controller/TelaLogin.fxml");
    }

}