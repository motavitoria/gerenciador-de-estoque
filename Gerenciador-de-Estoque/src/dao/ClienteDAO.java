package dao;

import model.Cliente;

public class ClienteDAO implements CadastroDAO {

	@Override
	public void criaUsuario(String tipousuario,String nomeUsuario, String senhaUsuario, String CPFUsuario) {
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
        
        public Cliente getCliente(){
            Cliente cliente = null; 
            return cliente;
        }
        

}
