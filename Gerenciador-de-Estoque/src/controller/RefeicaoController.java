package controller;

import java.util.Date;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import model.Refeicao;

public class RefeicaoController {
	
    @FXML
    private AnchorPane paneRefeicao;

    @FXML
    private TableView<Refeicao> tableRefeicao;

    @FXML
    private TableColumn<Refeicao, String> colunaNomeRefeicao;

    @FXML
    private TableColumn<Refeicao, Date> colunaDataEntrega;

    @FXML
    private TableColumn<Refeicao, String> colunaHoraEntrega;

    @FXML
    private Button botaoRefeicaoVoltar;

    @FXML
    private Button botaoRefeicaoAtualizar;

    @FXML
    private Button botaoRefeicaoCriar;

    @FXML
    private Button botaoRefeicaoExcluir;
    
}
