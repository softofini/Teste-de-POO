/**
 * Sample Skeleton for 'Login.fxml' Controller Class
 */

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
 
     @FXML // fx:id="txSenha"
     private PasswordField txSenha; // Value injected by FXMLLoader
 
     @FXML // fx:id="txUsuario"
     private TextField txUsuario; // Value injected by FXMLLoader
 
     @FXML
     void entrar(ActionEvent event) {
         ValidaUsuario validaUsuario = new ValidaUsuario();
         try {
             Usuario usuario = validaUsuario.validaLogin(txUsuario.getText(), txSenha.getText());
             App.setRoot("controller/secondary.fxml");
             MasterController controller =  (MasterController)App.getController();
             controller.setUsername(usuario.getUsername());
         } catch (ErroLogin e) {
             new Alert(AlertType.ERROR, e.getMessage()).showAndWait();
         }
     }
 
     @FXML
     void limparCampos(ActionEvent event) {
         txUsuario.setText("");
         txSenha.setText("");
     }
 
 }
 