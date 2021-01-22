package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Cliente;
import controller.MainPrograma;
import dao.ClienteDAO;
import dao.RefeicaoDAO;
import java.util.Date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Refeicao;

public class BuscaRefeicoesClienteController{ // O QUE ESSE CONTROLER FAZ? RETORNA AS REFEIÇÔES QUE O CLIENTE COMEU
    private static Scene menuPrincipalCliente;
    private static Scene refeicaoCliente;
    private static Stage stage;
    Cliente c;
    RefeicaoDAO refDAO = new RefeicaoDAO();
    private ObservableList<Refeicao> listadeRefeicoes;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneBuscaRefeicoesCliente;

    @FXML
    private TableView<Refeicao> tableBuscaRefeicoesCliente;

    @FXML
    private TableColumn<Refeicao, String> fieldNomeRefeicoesCliente;

    @FXML
    private TableColumn<Refeicao, Double> fieldPrecoRefeicoesCliente;

    @FXML
    private TableColumn<Refeicao,Date> fieldDataRefeicoesCliente;

    @FXML
    private TableColumn<Refeicao, String> fieldHoraRefeicoesCliente;

    @FXML
    private Button botaoReservarRefeicoesCliente;

    @FXML
    private Button botaoVoltarMenuPrincipalBusca;
    
    private ObservableList<Refeicao> populaListaRefeicoes(){
    	
    	listadeRefeicoes = FXCollections.observableArrayList();
    	fieldNomeRefeicoesCliente.setCellValueFactory(new PropertyValueFactory<Refeicao, String>("Nome Refeição"));
    	fieldPrecoRefeicoesCliente.setCellValueFactory(new PropertyValueFactory<Refeicao, Double>("Preço"));        
    	fieldDataRefeicoesCliente.setCellValueFactory(new PropertyValueFactory<Refeicao, Date>("Data"));
    	fieldHoraRefeicoesCliente.setCellValueFactory(new PropertyValueFactory<Refeicao, String>("Hora"));
        
        refDAO.getRefeicoes(1);    	
        return listadeRefeicoes;
    }
 
        
    @FXML
    void reservaRefeicoes(ActionEvent event) {
        MainPrograma.mudaTela("criaReserva",c);
    }

    @FXML
    void voltaMenuPrincipalCliente(ActionEvent event) throws IOException {
       MainPrograma.mudaTela("menuPrincipalCliente",c);
    }

    @FXML
    void initialize() {
        MainPrograma.addOnChangeScreenListener(new MainPrograma.onChangeScreen(){
          @Override
          public void onScreenChanged(String newscreen, Object objetoData){
              System.out.println("Nova tela: " + newscreen + " " + objetoData);
              c = (Cliente) objetoData;
          }
        });
        exibeRefeicoes();
        //Pega lista de refeições e manda para o table view
        //Mostra todas as refeições do sistema
    }
    
    public void exibeRefeicoes() {
    	
    	tableBuscaRefeicoesCliente.setItems(populaListaRefeicoes());
    	
    }


}
