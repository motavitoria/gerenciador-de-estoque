package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Ingrediente;

public class CriaIngredienteController {

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
    private TableView<Ingrediente> tableIngrediente;

    @FXML
    private TableColumn<Ingrediente, String> colunaNomeIngrediente;

    @FXML
    private TableColumn<Ingrediente, String> colunaMedidaIngrediente;

    @FXML
    private TableColumn<Ingrediente, Integer> colunaQuantidadeIng;
    

}
