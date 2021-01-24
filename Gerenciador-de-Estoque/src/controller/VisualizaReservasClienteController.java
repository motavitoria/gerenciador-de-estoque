package controller;

import dao.RefeicaoDAO;
import dao.ReservaDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Cliente;
import model.Reserva;

public class VisualizaReservasClienteController {
    Cliente c;
    ReservaDAO resDAO;
    RefeicaoDAO refDAO;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneVisualizaReservasCliente;

    @FXML
    private TableView<Reserva> tableVisualizaReservas;

    @FXML
    private TableColumn<Reserva, Integer> fieldIdReserva;

    @FXML
    private TableColumn<Reserva, String> fieldReservaRefeicao;

    @FXML
    private Button botaoVoltaMenuPrincipalClienteReservas;

    @FXML
    void voltarMenuPrincipalCliente(ActionEvent event) {
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
    }
    
    public void exibeRefeicoes() {
    	fieldIdReserva.setCellValueFactory(new PropertyValueFactory<Reserva, Integer>("Código da Reserva"));
    	fieldReservaRefeicao.setCellValueFactory(new PropertyValueFactory<Reserva, String>("Refeição Reservada"));        


        ObservableList<Integer> idReserva = FXCollections.observableArrayList(resDAO.getIdReserva(c.getNomeUsuario(),c.getSenhaUsuario()));
        ObservableList<String> nomeRefeicao = FXCollections.observableArrayList(refDAO.getNomeRefeicoes(c.getIdUsuario()));// VOU PRECISAR DE UMA HELP PARA VER COMO FAÇO ESSA CONSULTA E O QUE VOU PRECISAR


        
        fieldIdReserva = (TableColumn<Reserva, Integer>) idReserva;
        fieldReservaRefeicao = (TableColumn<Reserva, String>) nomeRefeicao;

    	
    }
}
