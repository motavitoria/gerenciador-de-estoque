package refeicao;

import java.util.Date;

public class Ingrediente extends Estoque{

	protected String nomeIngrediente;
	protected String unidadeMedida;
	protected int quantidadeIngrediente;
	
	public Ingrediente(int idObjeto) {
		super(idObjeto);
		this.idObjeto = idObjeto;
	}
	
	public String getNomeIngrediente() {
		return nomeIngrediente;
	}

	public void setNomeIngrediente(String nomeIngrediente) {
		this.nomeIngrediente = nomeIngrediente;
	}

	public String getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public int getQuantidadeIngrediente() {
		return quantidadeIngrediente;
	}

	public void setQuantidadeIngrediente(int quantidadeIngrediente) {
		this.quantidadeIngrediente = quantidadeIngrediente;
	}

	
	public void atualizaIngrediente(String nomeIngrediente, String unidadeMedida, int quantidadeIngrediente, int idObjeto) {
		this.nomeIngrediente = nomeIngrediente;
		this.unidadeMedida = unidadeMedida;
		this.quantidadeIngrediente = quantidadeIngrediente;
		this.idObjeto = idObjeto;
		// TODO criar uma String sql com a query de UPDATE
		
	}

	
	public void excluiIngrediente(int idObjeto) {
		// TODO criar uma String sql com a query de DELETE
		
	}

	
	public void criaIngrediente(String nomeIngrediente, String unidadeMedida, int quantidadeIngrediente, int idObjeto) {
		// TODO criar uma String sql com a query de INSERT
		
	}

	
	public void adicionaIngredientePrato(String nomeIngrediente, String unidadeMedida, int quantidadeIngrediente, int idObjeto, Prato idPrato) {
		// TODO criar uma String sql com a query de INSERT para junção de relacionamento (INGREDIENTE x PRATO)
		
	}

}
