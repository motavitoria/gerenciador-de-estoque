package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;


public class EstoqueController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneEstoque;

    @FXML
    private TableView<?> tableEstoque;

    @FXML
    private TableColumn<?, ?> fieldNomeRefeicaoEstoque;

    @FXML
    private TableColumn<?, ?> fieldIngredientesEstoque;

    @FXML
    private TableColumn<?, ?> fieldQuantidadeEstoque;

    @FXML
    private Button botaoAtualizarEstoque;

    @FXML
    void atualizaRefeicao(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
