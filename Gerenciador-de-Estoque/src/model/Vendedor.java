package model;

import java.util.List;

public class Vendedor extends Pessoa{
	
	private int totalRefeicoes;
	private List<Refeicao> refeicoes;
	
	public int getTotalRefeicoes() {
		return totalRefeicoes;
	}
	
	public void setTotalRefeicoes(int totalRefeicoes) {
		this.totalRefeicoes = totalRefeicoes;
	}
	
	public List<Refeicao> getRefeicoes() {
		return refeicoes;
	}
	
	public void setRefeicoes(List<Refeicao> refeicoes) {
		this.refeicoes = refeicoes;
	}
	
}
