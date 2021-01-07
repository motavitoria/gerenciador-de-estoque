package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginController {

    @FXML
    private AnchorPane paneLogin;

    @FXML
    private TextField fieldUser;
    
    @FXML
    private PasswordField fieldSenha;
    
    @FXML
    private Label lblErrors;

    @FXML
    private Button botaoEntrar;

}