package dao;

import java.sql.SQLException;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
public class ReservaDAO implements RestauranteDAO  {

	@Override
	public void cria() {
            
            /*
            try{
                Connection con = (Connection) ConstroiConexao.getConnection();
                String sql = String.format(""INSERT INTO my_table (col_string) VALUES('a string')"");
                con.executeUpdate(sql);
                }catch (SQLException ex){
                    
                }
            */    
	}

	@Override
	public void atualiza() {
		//Atualizo o que?
	}

	@Override
	public void exclui() {
		
	}

	@Override
	public void busca( ) {
		
	}
        

        
        public List<Integer>getIdReserva(String nomeUsuario, String senha){    
            List<Integer> id_res = null;
            try{
                 Connection connection = (Connection) FabricaConexaoDAO.getConnection();
                 String consulta = String.format("SELECT res.id_reserva, \r\n" + "  FROM reserva res");
                Statement statement = (Statement) connection.createStatement();
                ResultSet resultSet = statement.executeQuery(consulta);
                while(resultSet.next()){ // PRA QUE SERVE?
                    //
                }
            }catch(SQLException ex){
                String s = "Erro";
            }
            return id_res;
        }
        
        public List<Integer>getIdUsuario(int idReserva){    
            List<Integer> id_res = null;
            try{
                 Connection connection = (Connection) FabricaConexaoDAO.getConnection();
                 String consulta = String.format("SELECT res.id_reserva, \r\n" + "  FROM reserva res");
                Statement statement = (Statement) connection.createStatement();
                ResultSet resultSet = statement.executeQuery(consulta);
                while(resultSet.next()){ // PRA QUE SERVE?
                    //
                }
            }catch(SQLException ex){
                String s = "Erro";
            }
            return id_res;
        }

}
