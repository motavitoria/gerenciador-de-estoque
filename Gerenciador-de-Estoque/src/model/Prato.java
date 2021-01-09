package model;

import java.util.List;

public class Prato {
	
	private int idPrato;
	private String nomePrato;
	private List<Ingrediente> ingredientes;
	
	public Prato(int idPrato, String nomePrato, List<Ingrediente> ingredientes) {
		this.idPrato = idPrato;
		this.nomePrato = nomePrato;
		this.ingredientes = ingredientes;
	}

	public int getIdPrato() {
		return idPrato;
	}

	public void setIdPrato(int idPrato) {
		this.idPrato = idPrato;
	}

	public String getNomePrato() {
		return nomePrato;
	}

	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
}
