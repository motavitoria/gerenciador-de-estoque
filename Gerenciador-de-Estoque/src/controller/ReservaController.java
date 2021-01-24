package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class ReservaController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneReserva;

    @FXML
    private TableView<?> tableReserva;

    @FXML
    private TableColumn<?, ?> colunaCodigoReserva;

    @FXML
    private TableColumn<?, ?> colunaNomeRefeicaoReservada;

    @FXML
    private TableColumn<?, ?> colunaQuantidadeReserva;

    @FXML
    private Button botaoVoltarReserva;

    @FXML
    void voltaMenuPrincipal(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
