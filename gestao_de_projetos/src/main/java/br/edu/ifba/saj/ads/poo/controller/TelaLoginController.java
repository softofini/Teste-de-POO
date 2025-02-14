package br.edu.ifba.saj.ads.poo.controller;


import java.io.IOException;
import br.edu.ifba.saj.ads.poo.model.Usuario;
import br.edu.ifba.saj.ads.poo.negocios.Validar_Usuario;
import br.edu.ifba.saj.ads.poo.exception.ErroLogin;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import br.edu.ifba.saj.ads.poo.App;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class TelaLoginController {
    @FXML
    private TextField LoginText;

    @FXML
    private PasswordField SenhaText;

    // TESTE DE EXIBIÇÃO DE VARIAVEIS TEM Q JOGAR PRA CLASSE USUARIO
    @FXML
    private void switchToSecondary() throws IOException {
       Alert alert = new Alert(AlertType.INFORMATION);
         alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText(LoginText.getText() + " " + SenhaText.getText());
            alert.showAndWait();    
    }

}
