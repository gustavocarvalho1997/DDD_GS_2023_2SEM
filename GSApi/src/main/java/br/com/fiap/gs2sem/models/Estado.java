package br.com.fiap.gs2sem.models;

public final class Estado {
	//Atributos
	private int id;
	private String sigla;
	private String nome;
	
	// Construtores
	public Estado(int id, String sigla, String nome) {
		super();
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
	}
	public Estado() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}//CLASS