package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class LoginController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneLogin;

    @FXML
    private TextField fieldUser;

    @FXML
    private PasswordField fieldSenha;

    @FXML
    private Button botaoEntrar;

    @FXML
    private Label labelCriarCadastro;

    @FXML
    void abrirCriarCadastro(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }
}
