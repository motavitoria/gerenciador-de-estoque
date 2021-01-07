package refeicao;

import java.util.Date;

public class Refeicao extends Estoque{
	
	protected Date dataEntrega;
	protected String horaEntrega;
	
	public Refeicao(int idObjeto) {
		super(idObjeto);
		this.idObjeto = idObjeto;
	}
	
	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public String getHoraEntrega() {
		return horaEntrega;
	}

	public void setHoraEntrega(String horaEntrega) {
		this.horaEntrega = horaEntrega;
	}

	
	public void atualizaRefeicao(Date dataEntrega, String horaEntrega, int idObjeto) {
		this.dataEntrega = dataEntrega;
		this.horaEntrega = horaEntrega;
		this.idObjeto = idObjeto;
		// TODO criar uma String sql com a query de UPDATE
	}

	
	public void excluiRefeicao(int idObjeto) {
		// TODO criar uma String sql com a query de DELETE
		
	}

	
	public void criaRefeicao(Date dataEntrega, String horaEntrega, int idObjeto) {
		// TODO criar uma String sql com a query de INSERT
		
	}

}
