package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class ReservaController {

    @FXML
    private AnchorPane paneReserva;

    @FXML
    private TableView<?> tableReserva;

    @FXML
    private TableColumn<?, ?> colunaNomeRefeicao;

    @FXML
    private TableColumn<?, ?> colunaQuantidadeReserva;

    @FXML
    private Button botaoVoltarReserva;

    @FXML
    private Button botaoAtualizarReserva;

    @FXML
    private Button botaoCriaReserva;

    @FXML
    private Button botaoExcluiReserva;

}