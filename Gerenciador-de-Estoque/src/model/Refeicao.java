package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Refeicao {
	
	private int idRefeicao;
	private String nomeRefeicao;
	private LocalDate dataEntrega;
	private LocalTime horaEntrega;
	private List<Prato> pratos;
	
	public Refeicao(int idRefeicao, String nomeRefeicao, LocalDate dataEntrega, LocalTime horaEntrega, List<Prato> pratos) {
		this.idRefeicao = idRefeicao;
		this.nomeRefeicao = nomeRefeicao;
		this.dataEntrega = dataEntrega;
		this.horaEntrega = horaEntrega;
		this.pratos = pratos;
	}
	
	public int getIdRefeicao() {
		return idRefeicao;
	}

	public void setIdRefeicao(int idRefeicao) {
		this.idRefeicao = idRefeicao;
	}

	public String getNomeRefeicao() {
		return nomeRefeicao;
	}
	
	public void setNomeRefeicao(String nomeRefeicao) {
		this.nomeRefeicao = nomeRefeicao;
	}
	
	public LocalDate getDataEntrega() {
		return dataEntrega;
	}
	
	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	public LocalTime getHoraEntrega() {
		return horaEntrega;
	}
	
	public void setHoraEntrega(LocalTime horaEntrega) {
		this.horaEntrega = horaEntrega;
	}
	
	public List<Prato> getPratos() {
		return pratos;
	}
	
	public void setPratos(List<Prato> pratos) {
		this.pratos = pratos;
	}
	
}
