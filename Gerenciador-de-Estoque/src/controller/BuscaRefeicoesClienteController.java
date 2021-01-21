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
import java.util.Date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Refeicao;

public class BuscaRefeicoesClienteController{
    private static Scene menuPrincipalCliente;
    private static Scene refeicaoCliente;
    private static Stage stage;
    
    Cliente c;
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
        int idTeste = 1;
    	c.setIdUsuario(idTeste);
    	/*
        try {
            Connection con = (Connection) ConstroiConexao.getConnection(); // O QUE É O R?
            String sql = String.format("SELECT r.nome, r.data_entrega, r.hora_entrega, r.id_refeicao FROM refeicao r, login u WHERE u.id_usuario='%s';", v.getIdUsuario());
            Statement select = (Statement) con.createStatement();
            ResultSet rset = select.executeQuery(sql);

            while(rset.next()) {
            	dataListaRefeicao.add(new Refeicao(rset.getString(1), rset.getDate(2), rset.getString(3), rset.getInt(4)));
            }


        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
*/
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
