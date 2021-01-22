package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import model.Refeicao;

public class RefeicaoDAO implements RestauranteDAO {

	@Override
	public void cria() {
		
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
        
        public List<Refeicao> getRefeicoes(int idUsuario) {
            //TA ESTRANHO ISSO AI ACHO QUE NÂO PRECISA DO idUSUARIO
           
            List<Refeicao> refeicoes = null; 
            //refeicoes = String.format("SELECT login.cpf FROM login WHERE login.id_usuario = '%s'");
            try{
                 Connection connection = (Connection) FabricaConexaoDAO.getConnection();
                String consulta = String.format("SELECT ref.id_refeicao, \r\n" + "ref.id_funcionario,\r\n" + "ref.nome, \r\n" + "ref.tipo, \r\n" + "ref.quantidade_maxima,\r\n"
                        + "ref.preco,\r\n" + "ref.data_enmtrega" + "ref.hora_entrega,\r\n" + "FROM refeicao ref, \r\n" + "login usu,\r\n" + "WHERE ref.id_usuario = '%s' AND\r\n" +
                        "ref.id_usuario = usu.id_usuario;",idUsuario);
                Statement statement = (Statement) connection.createStatement();
                ResultSet resultSet = statement.executeQuery(consulta);
                
                while(resultSet.next()){
                    //
                }
            }catch(SQLException ex){
                String s = "";
            }
            
            return refeicoes;
	}

}
