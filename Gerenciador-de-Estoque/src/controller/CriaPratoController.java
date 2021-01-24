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

public class CriaPratoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneCriaPrato;

    @FXML
    private TextField fieldNomePrato;

    @FXML
    private Button botaoAtualizaPrato;

    @FXML
    private Button botaoVoltar;

    @FXML
    private Button botaoCriaPrato;

    @FXML
    private Button botaoCriaIngredientes;

    @FXML
    private TableView<?> tablePrato;

    @FXML
    private TableColumn<?, ?> colunaNomePrato;

    @FXML
    void abrirCriaIngrediente(ActionEvent event) {

    }

    @FXML
    void atualizaPrato(ActionEvent event) {

    }

    @FXML
    void criaPrato(ActionEvent event) {

    }

    @FXML
    void voltaRefeicao(ActionEvent event) {

    }

    @FXML
    void initialize() {
 
    }
}
