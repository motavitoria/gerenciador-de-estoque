package controller;

import dao.ClienteDAO;
import dao.ReservaDAO;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import model.Cliente;
import model.Refeicao;
import model.Reserva;

public class VisualizaReservasClienteController {
    Cliente c;
    ClienteDAO cDAO;
    ReservaDAO rDAO;
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
              List<Reserva> reservas = c.getReservas(c.getIdUsuario());
              /*
              for(int i  =0; i < reservas.size(); i++){
                  reservas.get(i).getIdReserva();
              }
                */
              fieldIdReserva = (TableColumn<Reserva, Integer>) c.getReservas(c.getIdUsuario());
              
              List <Refeicao> ref = null;
              for(int i  =0; i < reservas.size(); i++){
                  ref.add((Refeicao) reservas.get(i).getRefeicoesReservadas());
              }
              //fieldReservaRefeicao = (TableColumn<?, ?>) ref.getNomeRef(); descobrir como pegar esse nome
              
          }
        });
        
    }
}
