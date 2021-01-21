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
    
    public Vendedor getVendedor(/*parametro para o select(nome)*/){
            
            Vendedor vendedor = null; //select where nome = nome;
            return vendedor;
        }
}

