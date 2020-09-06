package refeicao;

import java.util.Date;

public abstract class Estoque {
	
	protected int idObjeto;
	
	public Estoque(int idObjeto) {
		
		this.idObjeto = idObjeto;
		
	}
	 
	public int getIdObjeto() {
		return idObjeto;
	}
	public void setIdObjeto(int idObjeto) {
		this.idObjeto = idObjeto;
	}

}
