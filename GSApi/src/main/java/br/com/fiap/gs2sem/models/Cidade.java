package br.com.fiap.gs2sem.models;

public final class Cidade {
	// Atributos
	private int id;
	private Estado estado;
	private String nome;
	private int ddd;
	
	// Construtores
	public Cidade(int id, Estado estado, String nome, int ddd) {
		super();
		this.id = id;
		this.estado = estado;
		this.nome = nome;
		this.ddd = ddd;
	}
	public Cidade() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public Estado getEstado() {
		return estado;
	}
	public String getNome() {
		return nome;
	}
	public int getDdd() {
		return ddd;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
}//CLASS