package model;

import java.util.List;

public class Reserva extends Restaurante {
	
	private List<Refeicao> refeicoesReservadas;
	private int quantidade;
	
	public Reserva(int id, List<Refeicao> refeicoesReservadas, int quantidade) {
		this.id = id;
		this.refeicoesReservadas = refeicoesReservadas;
		this.quantidade = quantidade;
	}

	public List<Refeicao> getRefeicoesReservadas() {
		return refeicoesReservadas;
	}

	public void setRefeicoesReservadas(List<Refeicao> refeicoesReservadas) {
		this.refeicoesReservadas = refeicoesReservadas;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
