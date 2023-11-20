package br.com.fiap.gs2sem.models;

public final class Recomendacao {
	// Atributos
	private int id;
	private String recomendacao;
	private Resultado resultado;
	
	// Construtores
	public Recomendacao(int id, String recomendacao, Resultado resultado) {
		super();
		this.id = id;
		this.recomendacao = recomendacao;
		this.resultado = resultado;
	}
	public Recomendacao() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public String getRecomendacao() {
		return recomendacao;
	}
	public Resultado getResultado() {
		return resultado;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setRecomendacao(String recomendacao) {
		this.recomendacao = recomendacao;
	}
	public void setResultado(Resultado resultado) {
		this.resultado = resultado;
	}
}//CLASS