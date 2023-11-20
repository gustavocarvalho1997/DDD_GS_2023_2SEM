package br.com.fiap.gs2sem.models;

public final class Bairro {
	// Atributos
	private int id;
	private Cidade cidade;
	private String nome;
	private String zona;
	
	// Construtores
	public Bairro(int id, Cidade cidade, String nome, String zona) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.nome = nome;
		this.zona = zona;
	}
	public Bairro() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public String getNome() {
		return nome;
	}
	public String getZona() {
		return zona;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
}//CLASS