package controller;

import dao.ClienteDAO;
import dao.VendedorDAO;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Cliente;
import model.Vendedor;

public class CriaCadastroController {

    Cliente c;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane paneCriaCadastro;

    @FXML
    private TextField fieldNomeUsuario;

    @FXML
    private TextField fieldSenhaUsuario;

    @FXML
    private TextField fieldCpfUsuario;

    @FXML
    private ComboBox<String> comboTipoUsuario;

    @FXML
    private Button botaoConfirmarCadastro;

    private List<String> tiposUs = new ArrayList<>();
    
    private ObservableList<String> obsTiposUs;
    
    @FXML
    void initialize() {
        MainPrograma.addOnChangeScreenListener(new MainPrograma.onChangeScreen(){
          @Override
          public void onScreenChanged(String newscreen, Object objetoData){
              System.out.println("Nova tela: " + newscreen + " " + objetoData);
              c = (Cliente) objetoData;
          }
        });
        carregarTipoUsuario();
        
    }
    
    public void carregarTipoUsuario(){
        tiposUs.add("V");
        tiposUs.add("C");
        obsTiposUs = FXCollections.observableArrayList(tiposUs);
        comboTipoUsuario.setItems(obsTiposUs);
    }
    
    @FXML
    void abreMenuPrincipal(ActionEvent event) {
        String nomeUsuario = fieldNomeUsuario.getText();
        String senhaUsuario = fieldSenhaUsuario.getText();
        String CPFUsuario = fieldCpfUsuario.getText();
        String tipoUsuario = comboTipoUsuario.getSelectionModel().getSelectedItem();
        c = new Cliente();
        if("C".equals(tipoUsuario)){
            c.setNomeUsuario(nomeUsuario);

            ClienteDAO cDAO = new ClienteDAO();
            cDAO.criaUsuario(tipoUsuario,nomeUsuario,senhaUsuario,CPFUsuario);
            Cliente c = cDAO.getCliente(cDAO.getIdCliente(nomeUsuario,senhaUsuario));
            MainPrograma.mudaTela("menuPrincipalCliente",c);
        }else{
            VendedorDAO vDAO = new VendedorDAO();
            vDAO.criaUsuario(tipoUsuario,nomeUsuario,senhaUsuario,CPFUsuario);
            Vendedor v = vDAO.getVendedor(vDAO.getIdVendedor(nomeUsuario,senhaUsuario));
            MainPrograma.mudaTela("menuPrincipalVendedor",v);
        }
    }
}