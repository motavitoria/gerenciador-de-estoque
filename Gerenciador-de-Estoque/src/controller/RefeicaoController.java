package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;

public class RefeicaoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneRefeicao;

    @FXML
    private Button botaoRefeicaoVoltar;

    @FXML
    private Button botaoRefeicaoAtualizar;

    @FXML
    private Button botaoRefeicaoCriar;

    @FXML
    private Button botaoRefeicaoExcluir;

    @FXML
    private TableColumn<?, ?> colunaNomeRefeicao;

    @FXML
    private TableColumn<?, ?> colunaTipoRefeicao;

    @FXML
    private TableColumn<?, ?> colunaPrecoRefeicao;

    @FXML
    private TableColumn<?, ?> colunaDataEntrega;

    @FXML
    private TableColumn<?, ?> colunaHoraEntrega;

    @FXML
    void abrirAtualizaCriaRefeicao(ActionEvent event) {

    }

    @FXML
    void abrirCriaRefeicao(ActionEvent event) {

    }

    @FXML
    void abrirMenuPrincipal(ActionEvent event) {

    }

    @FXML
    void excluirRefeicao(ActionEvent event) {

    }

    @FXML
    void initialize() {

    }
}
