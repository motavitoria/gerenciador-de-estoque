package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class BuscaRefeicoesClienteController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneBuscaRefeicoesCliente;

    @FXML
    private TableView<?> tableBuscaRefeicoesCliente;

    @FXML
    private TableColumn<?, ?> fieldNomeRefeicoesCliente;

    @FXML
    private TableColumn<?, ?> fieldPrecoRefeicoesCliente;

    @FXML
    private TableColumn<?, ?> fieldDataRefeicoesCliente;

    @FXML
    private TableColumn<?, ?> fieldHoraRefeicoesCliente;

    @FXML
    private Button botaoReservarRefeicoesCliente;

    @FXML
    private Button botaoVoltarMenuPrincipalBusca;

    @FXML
    void reservaRefeicoes(ActionEvent event) {

    }

    @FXML
    void voltaMenuPrincipalCliente(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
