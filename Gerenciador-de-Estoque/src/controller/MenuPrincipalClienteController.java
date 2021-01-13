package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuPrincipalClienteController {

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
    	
    	MainPrograma.addOnChangeScreenListener(new MainPrograma.onChangeScreen() {
			
			@Override
			public void onScreenChanged(String novaTela, Object objetoData) {
				// TODO Auto-generated method stub
				
			}
		});

    }
    
    @FXML
    void abreBuscaRefeicaoCliente(ActionEvent event) {

    }

    @FXML
    void abreReservasCliente(ActionEvent event) {

    }
}
