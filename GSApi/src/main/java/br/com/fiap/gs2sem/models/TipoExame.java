package br.com.fiap.gs2sem.models;

public final class TipoExame {
	// Atributos
	private int id;
	private String nome;
	
	// Construtores
	public TipoExame(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
	public TipoExame() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}//CLASS