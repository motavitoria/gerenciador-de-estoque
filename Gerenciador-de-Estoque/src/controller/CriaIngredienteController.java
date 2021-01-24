package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CriaIngredienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneCriaIngrediente;

    @FXML
    private TextField fieldNomeIngrediente;

    @FXML
    private TextField fieldMedidaIngrediente;

    @FXML
    private TextField fieldQuantidadeIngrediente;

    @FXML
    private Button botaoAtualizaIngrediente;

    @FXML
    private Button botaoCriaIngrediente;

    @FXML
    private Button botaoVoltarIngrediente;

    @FXML
    private TableView<?> tableIngrediente;

    @FXML
    private TableColumn<?, ?> colunaNomeIngrediente;

    @FXML
    private TableColumn<?, ?> colunaMedidaIngrediente;

    @FXML
    private TableColumn<?, ?> colunaQuantidadeIng;

    @FXML
    private TextField fieldQuantidadeIngrediente1;

    @FXML
    private TextField fieldQuantidadeIngrediente2;

    @FXML
    void atualizaIngrediente(ActionEvent event) {

    }

    @FXML
    void criaIngrediente(ActionEvent event) {

    }

    @FXML
    void voltarPrato(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
