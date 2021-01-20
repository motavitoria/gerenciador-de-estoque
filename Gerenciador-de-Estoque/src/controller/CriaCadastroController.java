package controller;

import dao.ClienteDAO;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
    private ComboBox<String> comboTipoUsuario;

    @FXML
    private Button botaoConfirmarCadastro;

    private List<String> tiposUs = new ArrayList<>();
    
    private ObservableList<String> obsTiposUs;
    
    @FXML
    void initialize() {
        carregarTipoUsuario();
        
    }
    
    public void carregarTipoUsuario(){
        tiposUs.add("V");
        tiposUs.add("C");
        obsTiposUs = FXCollections.observableArrayList(tiposUs);
        comboTipoUsuario.setItems(obsTiposUs);
    }
    
    @FXML
    void abreMenuPrincipal(ActionEvent event) {
        //dividir entre menuvendedor e o menucliente
        String nomeUsuario = fieldNomeUsuario.getText();
        String senhaUsuario = fieldSenhaUsuario.getText();
        String CPFUsuario = fieldCpfUsuario.getText();
        String tipoUsario = comboTipoUsuario.getSelectionModel().getSelectedItem();
        ClienteDAO cDAO = new ClienteDAO();
        cDAO.criaUsuario(tipoUsario,nomeUsuario,senhaUsuario,CPFUsuario);
    }
}