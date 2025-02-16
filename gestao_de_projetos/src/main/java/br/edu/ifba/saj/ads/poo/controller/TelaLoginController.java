package br.edu.ifba.saj.ads.poo.controller;

import br.edu.ifba.saj.ads.poo.App;
import br.edu.ifba.saj.ads.poo.exception.ErroLogin;
import br.edu.ifba.saj.ads.poo.model.Usuario;
import br.edu.ifba.saj.ads.poo.negocios.ValidaUsuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class TelaLoginController {

    @FXML
    private PasswordField txSenha;

    @FXML
    private TextField txUsuario; 

    @FXML
    void entrar(ActionEvent event) {
        ValidaUsuario validaUsuario = new ValidaUsuario();
        try {
            Usuario usuario = validaUsuario.validaLogin(txUsuario.getText(), txSenha.getText());
            App.setRoot("controller/secondary.fxml");
            GeralController controller =  (GeralController)App.getController();
            controller.setUsername(usuario.getUsername());
        } catch (ErroLogin e) {
            new Alert(AlertType.ERROR, e.getMessage()).showAndWait();
        }
    }

}
