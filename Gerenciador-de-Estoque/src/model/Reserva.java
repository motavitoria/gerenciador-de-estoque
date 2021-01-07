package model;

import java.util.List;

public class Reserva {
	
	private int idReserva;
	private List<Refeicao> refeicoesReservadas;
	private int quantidade;
	
	public Reserva(int idReserva, List<Refeicao> refeicoesReservadas, int quantidade) {
		this.idReserva = idReserva;
		this.refeicoesReservadas = refeicoesReservadas;
		this.quantidade = quantidade;
	}
	
	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
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
