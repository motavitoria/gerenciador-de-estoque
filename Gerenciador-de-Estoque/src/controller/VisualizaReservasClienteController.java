package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class VisualizaReservasClienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneVisualizaReservasCliente;

    @FXML
    private TableView<?> tableVisualizaReservas;

    @FXML
    private TableColumn<?, ?> fieldIdReserva;

    @FXML
    private TableColumn<?, ?> fieldReservaRefeicao;

    @FXML
    private Button botaoVoltaMenuPrincipalClienteReservas;

    @FXML
    void voltarMenuPrincipalCliente(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
