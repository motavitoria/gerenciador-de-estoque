package refeicao;

import java.util.Date;

public class Prato extends Estoque{
	
	protected String tipoPrato;
	protected String nomePrato;
	protected int limitePrato;
	protected double precoPrato;
	
	public Prato(int idObjeto) {
		super(idObjeto);
		this.idObjeto = idObjeto;
	}
	
	public String getTipoPrato() {
		return tipoPrato;
	}

	public void setTipoPrato(String tipoPrato) {
		this.tipoPrato = tipoPrato;
	}

	public String getNomePrato() {
		return nomePrato;
	}

	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}

	public int getLimitePrato() {
		return limitePrato;
	}

	public void setLimitePrato(int limitePrato) {
		this.limitePrato = limitePrato;
	}

	public double getPrecoPrato() {
		return precoPrato;
	}

	public void setPrecoPrato(double precoPrato) {
		this.precoPrato = precoPrato;
	}

	
	public void atualizaPrato(String tipoPrato, String nomePrato, double precoPrato, int idObjeto) {
		this.tipoPrato = tipoPrato;
		this.nomePrato = nomePrato;
		this.precoPrato = precoPrato;
		this.idObjeto = idObjeto;
		// TODO criar uma String sql com a query de UPDATE
	}

	
	public void excluiPrato(int idObjeto) {
		// TODO criar uma String sql com a query de DELETE
		
	}

	
	public void criaPrato(String tipoPrato, String nomePrato, double precoPrato, int idObjeto) {
		// TODO criar uma String sql com a query de INSERT
		
	}

	
	public void adicionaPratoRefeicao(String tipoPrato, String nomePrato, double precoPrato, int idObjeto, Refeicao idRefeicao) {
		// TODO criar uma String sql com a query de INSERT para junção de relacionamento (PRATO x REFEICAO)
		
	}

}
