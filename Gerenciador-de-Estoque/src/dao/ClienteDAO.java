package dao;

import model.Cliente;

public class ClienteDAO implements CadastroDAO {

	@Override
	public void criaUsuario() {

	}

	@Override
	public void verificaTipo() {

	}

	@Override
	public boolean tipoValido() {
		return false;
	}
        
        public Cliente getCliente(){
            Cliente cliente = null; 
            return cliente;
        }
        

}
