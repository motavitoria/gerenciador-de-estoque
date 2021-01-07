package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CriaReservaController {

    @FXML
    private AnchorPane paneCriaReserva;

    @FXML
    private ComboBox<?> comboRefeicaoReserva;

    @FXML
    private TextField fieldQuantidadeReserva;

    @FXML
    private Button botaoAtualizaReserva;

    @FXML
    private Button botaoCriaReserva;

    @FXML
    private Button botaoVoltaReserva;

}
