package br.com.fiap.gs2sem.models;

public final class Logradouro {
	// Atributos
	private int id;
	private Bairro bairro;
	private String nome;
	private String cep;
	
	// Construtores
	public Logradouro(int id, Bairro bairro, String nome, String cep) {
		super();
		this.id = id;
		this.bairro = bairro;
		this.nome = nome;
		this.cep = cep;
	}
	public Logradouro() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public Bairro getBairro() {
		return bairro;
	}
	public String getNome() {
		return nome;
	}
	public String getCep() {
		return cep;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
}//CLASS