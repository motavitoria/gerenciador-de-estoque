package controller;

import dao.ReservaDAO;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Cliente;

public class CriaReservaController {
    ReservaDAO rDAO;
    Cliente c;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneCriaReserva;

    @FXML
    private TextField fieldQuantidadeReserva;

    @FXML
    private Button botaoCriaReserva;

    @FXML
    private Button botaoVoltaReserva;

    @FXML
    void voltaReserva(ActionEvent event) {
      MainPrograma.mudaTela("buscaRefeicaoCliente",c);        
    }
    
    @FXML
    void criareserva(ActionEvent event) {
        //TO DO Criar Reserva da linha selecionada
        rDAO.cria();
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
    }
}
