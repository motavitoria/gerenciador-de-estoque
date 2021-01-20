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

public class BuscaRefeicoesClienteController{
    private static Scene menuPrincipalCliente;
    private static Scene refeicaoCliente;
    private static Stage stage;
    
    Cliente c;
    
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
        
        //Pega lista de refeições e manda para o table view
        //Mostra todas as refeições do sistema
    }


}
