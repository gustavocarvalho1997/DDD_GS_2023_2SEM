package br.com.fiap.gs2sem.models;

public final class Endereco {
	// Atributos
	private int id;
	private Logradouro logradouro;
	private int numero;
	private String complemento;
	
	// Construtores
	public Endereco(int id, Logradouro logradouro, int numero, String complemento) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}
	public Endereco(int id, Logradouro logradouro, int numero) {
		super();
		this.id = id;
		this.logradouro = logradouro;
		this.numero = numero;
	}
	public Endereco() {
		super();
	}
	public Endereco(int id) {
		super();
		this.id = id;
	}
	// Getters
	public int getId() {
		return id;
	}
	public Logradouro getLogradouro() {
		return logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
}//CLASS