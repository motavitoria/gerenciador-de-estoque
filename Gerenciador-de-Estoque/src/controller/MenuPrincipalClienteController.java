package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.Cliente;

public class MenuPrincipalClienteController {
    Cliente c;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button botaoReservasCliente;

    @FXML
    private Button botaoBuscaRefeicaoCliente;
    
    
    
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
    
    @FXML
    void abreBuscaRefeicaoCliente(ActionEvent event) {
        MainPrograma.mudaTela("buscaRefeicaoCliente",c);
    }

    @FXML
    void abreReservasCliente(ActionEvent event) {
        MainPrograma.mudaTela("buscaReservasCliente",c);
    }
}
