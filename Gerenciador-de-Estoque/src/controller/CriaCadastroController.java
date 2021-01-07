package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CriaCadastroController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneCriaCadastro;

    @FXML
    private TextField fieldNomeUsuario;

    @FXML
    private TextField fieldSenhaUsuario;

    @FXML
    private TextField fieldCpfUsuario;

    @FXML
    private ComboBox<?> comboTipoUsuario;

    @FXML
    private Button botaoConfirmarCadastro;

    @FXML
    void initialize() {

    }
    
    @FXML
    void abreMenuPrincipal(ActionEvent event) {

    }
}