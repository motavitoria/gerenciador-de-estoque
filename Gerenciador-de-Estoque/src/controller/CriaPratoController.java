package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Prato;

public class CriaPratoController {
    @FXML
    private AnchorPane paneCriaPrato;

    @FXML
    private TextField fieldPrecoPrato;

    @FXML
    private TextField fieldQtdPrato;

    @FXML
    private TextField fieldNomePrato;

    @FXML
    private TextField fieldTipoPrato;

    @FXML
    private Button botaoAtualizaPrato;

    @FXML
    private Button botaoVoltar;

    @FXML
    private Button botaoCriaPrato;

    @FXML
    private Button botaoCriaIngredientes;

    @FXML
    private TableView<Prato> tablePrato;

    @FXML
    private TableColumn<Prato, String> colunaTipoPrato;

    @FXML
    private TableColumn<Prato, String> colunaNomePrato;

    @FXML
    private TableColumn<Prato, Integer> colunaQuantidadePrato;

    @FXML
    private TableColumn<Prato, Double> colunaPrecoPrato;
    

}
