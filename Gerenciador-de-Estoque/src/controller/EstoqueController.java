package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class EstoqueController {

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

}
