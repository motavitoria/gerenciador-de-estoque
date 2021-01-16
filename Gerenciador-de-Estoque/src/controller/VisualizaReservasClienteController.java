package controller;

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
import model.Reserva;

public class VisualizaReservasClienteController {
    Cliente c;
    
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
        MainPrograma.mudaTela("menuPrincipalCliente",c);
    }

    @FXML
    void initialize() {
        MainPrograma.addOnChangeScreenListener(new MainPrograma.onChangeScreen(){
          @Override
          public void onScreenChanged(String newscreen, Object objetoData){
              System.out.println("Nova tela: " + newscreen + " " + objetoData);
              c = (Cliente) objetoData;
              List<Reserva> reservas = c.getReservas();
              /*
              for(int i  =0; i < reservas.size(); i++){
                  reservas.get(i).getIdReserva();
              }
                */
              fieldIdReserva = (TableColumn<?, ?>) c.getReservas();
              /*
              List <Refeicao> ref = null;
              for(int i  =0; i < reservas.size(); i++){
                  ref.add((Refeicao) reservas.get(i).getRefeicoesReservadas());
              }
              fieldReservaRefeicao = (TableColumn<?, ?>) c.getReservas();
              */
          }
        });
        
        //Pega lista de reservas do cliente e manda para o table view
        // confirmar se usar Cliente como objetoData é a forma como ela pensou em fazer as coisas
        //Pego lista de reservas do cliente e separo em um for colocando o ID em uma coluna e ????
    }
}
