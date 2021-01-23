package dao;

import model.Vendedor;

public class VendedorDAO implements CadastroDAO {

	@Override
	public void criaUsuario(String tipousuario,String nomeUsuario, String senhaUsuario, String CPFUsuario) {
            verificaTipo(tipousuario);
	}

	@Override
	public boolean verificaTipo(String tipousuario) { //MUDEI DE VOID PARA BOOLEAN
            if(tipoValido(tipousuario) == true){
                if(tipousuario == "V"){
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
    
    public Vendedor getVendedor(int idVendedor){
            String nome = String.format("SELECT login.nome FROM login WHERE login.id_usuario = '%s'",idVendedor);
            String CPF = String.format("SELECT login.cpf FROM login WHERE login.id_usuario = '%s'",idVendedor);
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
            Vendedor vendedor = null; 
            return vendedor;
    }
    
    public Integer getIdVendedor(String nome, String senha){
            int idVendedor;
            
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
            idVendedor = 0; // arrumar de acordo com a consulta
            
            return idVendedor;   
        }
    
    
}

