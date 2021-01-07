package model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Refeicao extends Restaurante {
	
	private String nomeRefeicao;
	private LocalDate dataEntrega;
	private LocalTime horaEntrega;
	private List<Prato> pratos;
	
	public Refeicao(int id, String nomeRefeicao, LocalDate dataEntrega, LocalTime horaEntrega, List<Prato> pratos) {
		this.id = id;
		this.nomeRefeicao = nomeRefeicao;
		this.dataEntrega = dataEntrega;
		this.horaEntrega = horaEntrega;
		this.pratos = pratos;
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
