package dao;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;

import model.Cliente;

public class ClienteDAO implements CadastroDAO {

	@Override
	public void criaUsuario(String tipoUsuario,String nomeUsuario, String senhaUsuario, String CPFUsuario) {
          if(verificaTipo(tipoUsuario)){
            /*
            try{
                 Connection connection = (Connection) FabricaConexaoDAO.getConnection();      
                 String consulta = String.format("INSERT IN %S,%s,%s,%s",tipousuario,nomeUsuario,senhaUsuario,CPFUsuario);
                Statement statement = (Statement) connection.createStatement();
                ResultSet resultSet = statement.executeQuery(consulta);
                
                while(resultSet.next()){
                    //
                }
            }catch(SQLException ex){
                String s = "";
            }
            */ //TO DO  CONFIGURAR DIREITO ISSO AQUI
          }
          
	}

	@Override
	public boolean verificaTipo(String tipo) {  //MUDEI DE VOID PARA BOOLEAN
            if(tipoValido(tipo) == true){
                if("C".equals(tipo)){
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
            String nome = String.format("SELECT login.nome FROM login WHERE login.id_usuario = '%s'",idCliente);
            String CPF = String.format("SELECT login.cpf FROM login WHERE login.id_usuario = '%s'",idCliente);
           /*
            try{
                 Connection connection = (Connection) FabricaConexaoDAO.getConnection();      
                 String consulta = String.format("SELECT login.nome, \r\n" + "login.cpf,\r\n" 
                        + "ref.preco,\r\n" + "ref.data_enmtrega" + "ref.hora_entrega,\r\n" + "FROM refeicao ref, \r\n" + "login usu,\r\n" + "WHERE ref.id_usuario = '%s' AND\r\n" +
                        "ref.id_usuario = usu.id_usuario;",idCliente);
                Statement statement = (Statement) connection.createStatement();
                ResultSet resultSet = statement.executeQuery(consulta);
                
                while(resultSet.next()){
                    //
                }
            }catch(SQLException ex){
                String s = "";
            }
            */ //TO DO  CONFIGURAR DIREITO ISSO AQUI
            Cliente cliente = null; //select where nome = nome;
            return cliente;
        }
        
        public Integer getIdCliente(String nome, String senha){
            int idCliente;
            
                       /*
            try{
                 Connection connection = (Connection) FabricaConexaoDAO.getConnection();      
                 String consulta = String.format("SELECT login.nome, \r\n" + "login.cpf,\r\n" 
                        + "ref.preco,\r\n" + "ref.data_enmtrega" + "ref.hora_entrega,\r\n" + "FROM refeicao ref, \r\n" + "login usu,\r\n" + "WHERE ref.id_usuario = '%s' AND\r\n" +
                        "ref.id_usuario = usu.id_usuario;",idCliente);
                Statement statement = (Statement) connection.createStatement();
                ResultSet resultSet = statement.executeQuery(consulta);
                
                while(resultSet.next()){
                    //
                }
            }catch(SQLException ex){
                String s = "";
            }
            */ //TO DO  CONFIGURAR DIREITO ISSO AQUI
            idCliente = 0; // arrumar de acordo com a consulta
            
            return idCliente;   
        }
        

}
