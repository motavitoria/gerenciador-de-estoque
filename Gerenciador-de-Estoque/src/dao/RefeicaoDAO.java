package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.List;
import model.Refeicao;

public class RefeicaoDAO implements RestauranteDAO {
        private Refeicao refeicao;
	private Connection connection;
	private ResultSet resultSet;
	private String consulta;
	private Statement statement;
        
	@Override
	public void cria() {
		//TODO INSERÇÂO NO BD
	}

	@Override
	public void atualiza() {
		
	}

	@Override
	public void exclui() {
		
	}

	@Override
	public void busca() {
		
	}
        
        public List<Refeicao> buscaListaRefeicoes() {
            //TA ESTRANHO ISSO AI ACHO QUE NÂO PRECISA DO idUSUARIO
           
            List<Refeicao> refeicoes = null; 
            int idUsuario = 4;
            //refeicoes = String.format("SELECT login.cpf FROM login WHERE login.id_usuario = '%s'");
            try{
                 connection = (Connection) FabricaConexaoDAO.getConnection();     
                 String consulta = String.format("SELECT ref.id_refeicao,\r\n" + 
					"	   					 ref.id_usuario,\r\n" + 
					"	  					 ref.nome,\r\n" + 
					"     					 ref.tipo,\r\n" + 
					"      					 ref.quantidade_maxima,\r\n" + 
					"      					 ref.preco,\r\n" + 
					"      					 ref.data_entrega,\r\n" + 
					"      					 ref.hora_entrega\r\n" + 
					"				  FROM   refeicao ref,\r\n" + 
					"	 			 		 login usu\r\n" + 
					"				  WHERE  ref.id_usuario = '%s' AND\r\n" + 
					"	   					 ref.id_usuario = usu.id_usuario;", idUsuario);
                 
                statement = (Statement) connection.createStatement();
                ResultSet resultSet = statement.executeQuery(consulta);
                
                while(resultSet.next()) {
                    //refeicoes.add(new Refeicao(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3),
			//			resultSet.getInt(4), resultSet.getDouble(5), resultSet.getDate(6), resultSet.getTime(7)));
                }
            }catch(SQLException ex){
                String s = "";
            }         
            return refeicoes;
	}
        
        public List<String>getNomeRefeicoes(){
            List<String> nomes = null;
            try{
                 Connection connection = (Connection) FabricaConexaoDAO.getConnection();
                 String consulta = String.format("SELECT ref.nome, \r\n" + "  FROM refeicao ref");
                Statement statement = (Statement) connection.createStatement();
                ResultSet resultSet = statement.executeQuery(consulta);
                while(resultSet.next()){ // PRA QUE SERVE?
                    //
                }
            }catch(SQLException ex){
                String s = "Erro";
            }
            return nomes;
        }
        
        public List<String>getNomeRefeicoes(Integer idCliente){
            List<String> nomes = null;
            try{
                // PENSAR EM COMO FAZER ESSE SELECT
                 Connection connection = (Connection) FabricaConexaoDAO.getConnection();
                 String consulta = String.format("SELECT ref.nome, \r\n" + "  FROM refeicao ref WHERE ref_id");
                Statement statement = (Statement) connection.createStatement();
                ResultSet resultSet = statement.executeQuery(consulta);
                while(resultSet.next()){ // PRA QUE SERVE?
                    //
                }
            }catch(SQLException ex){
                String s = "Erro";
            }
            return nomes;
        }
        
        public List<Double>getPrecoRefeicoes(){    
            List<Double> precos = null;
            try{
                 Connection connection = (Connection) FabricaConexaoDAO.getConnection();
                 String consulta = String.format("SELECT ref.preco, \r\n" + "  FROM refeicao ref");
                Statement statement = (Statement) connection.createStatement();
                ResultSet resultSet = statement.executeQuery(consulta);
                while(resultSet.next()){ // PRA QUE SERVE?
                    //
                }
            }catch(SQLException ex){
                String s = "Erro";
            }
            return precos;
        }
        
        public List<Date>getDataRefeicoes(){
            List<Date> datas = null;
            try{
                 Connection connection = (Connection) FabricaConexaoDAO.getConnection();
                 String consulta = String.format("SELECT ref.data_entrega, \r\n" + "  FROM refeicao ref");
                Statement statement = (Statement) connection.createStatement();
                ResultSet resultSet = statement.executeQuery(consulta);
                while(resultSet.next()){ // PRA QUE SERVE?
                    //
                }
            }catch(SQLException ex){
                String s = "Erro";
            }
            return datas;
        }
        
        public List<String>getHoraRefeicoes(){
            List<String> horas = null;
            try{
                 Connection connection = (Connection) FabricaConexaoDAO.getConnection();
                 String consulta = String.format("SELECT ref.hora_entrega, \r\n" + "  FROM refeicao ref");
                Statement statement = (Statement) connection.createStatement();
                ResultSet resultSet = statement.executeQuery(consulta);
                while(resultSet.next()){ // PRA QUE SERVE?
                    //
                }
            }catch(SQLException ex){
                String s = "Erro";
            }
            return horas;
        }    
}
