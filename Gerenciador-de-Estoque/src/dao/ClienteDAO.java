package dao;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import model.Cliente;

public class ClienteDAO implements CadastroDAO {

	@Override
	public void criaUsuario(String tipousuario,String nomeUsuario, String senhaUsuario, String CPFUsuario) {
          Connection connection = (Connection) FabricaConexaoDAO.getConnection();
          
          verificaTipo(tipousuario);
          
	}

	@Override
	public boolean verificaTipo(String tipo) {  //MUDEI DE VOID PARA BOOLEAN
            if(tipoValido(tipo) == true){
                if(tipo == "C"){
                    return true;
                }
            }
            return false;
	}

	@Override
	public boolean tipoValido(String tipo) {
            if(tipo != "V" || tipo != "C"){
                return false;
            }else{
                return true;
            }
		
	}
        
        public Cliente getCliente(int idCliente){
            Connection connection = (Connection) FabricaConexaoDAO.getConnection();
            String nome = String.format("SELECT login.nome FROM login WHERE login.id_usuario = '%s'",idCliente);
            String CPF = String.format("SELECT login.cpf FROM login WHERE login.id_usuario = '%s'",idCliente);
            
            Cliente cliente = null; //select where nome = nome;
            return cliente;
        }
        

}
