package br.com.fiap.gs2sem.models;

public final class Laboratorio {
	// Atributos
	private int id;
	private Endereco endereco;
	private String nome;
	private String telefone;
	private String cnpj;
	private String razaoSocial;
	private String email;
	private String responsavelTecnico;
	
	// Construtores
	public Laboratorio(int id, Endereco endereco, String nome, String telefone, String cnpj, String razaoSocial,
			String email, String responsavelTecnico) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.nome = nome;
		this.telefone = telefone;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.email = email;
		this.responsavelTecnico = responsavelTecnico;
	}
	public Laboratorio() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public String getEmail() {
		return email;
	}
	public String getResponsavelTecnico() {
		return responsavelTecnico;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setResponsavelTecnico(String responsavelTecnico) {
		this.responsavelTecnico = responsavelTecnico;
	}
}//CLASS