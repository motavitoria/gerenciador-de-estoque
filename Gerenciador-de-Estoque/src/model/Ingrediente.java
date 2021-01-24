package model;

public class Ingrediente {
	
	private int idIngrediente;
	private String nomeIngrediente;
	private String medida;
	private int quantidadeEstoque;
	private int quantidadePorPrato;
	private int quantidadeMinima;
	
	public Ingrediente(int idIngrediente, String nomeIngrediente, String medida, int quantidadeEstoque,
			int quantidadePorPrato, int quantidadeMinima) {
		this.idIngrediente = idIngrediente;
		this.nomeIngrediente = nomeIngrediente;
		this.medida = medida;
		this.quantidadeEstoque = quantidadeEstoque;
		this.quantidadePorPrato = quantidadePorPrato;
		this.quantidadeMinima = quantidadeMinima;
	}

	public int getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(int idIngrediente) {
		this.idIngrediente = idIngrediente;
	}

	public String getNomeIngrediente() {
		return nomeIngrediente;
	}

	public void setNomeIngrediente(String nomeIngrediente) {
		this.nomeIngrediente = nomeIngrediente;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public int getQuantidadePorPrato() {
		return quantidadePorPrato;
	}

	public void setQuantidadePorPrato(int quantidadePorPrato) {
		this.quantidadePorPrato = quantidadePorPrato;
	}

	public int getQuantidadeMinima() {
		return quantidadeMinima;
	}

	public void setQuantidadeMinima(int quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}
	
}
