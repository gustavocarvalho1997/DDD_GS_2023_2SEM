package br.com.fiap.gs2sem.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public final class Paciente {
	// Atributos
	private int id;
	private Endereco endereco;
	private char sexo;
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dataNascimento;
	private String email;
	private String nome;
	private String senha;
	private String tipoSanguineo;
	private double altura;
	private double peso;
	
	// Construtores
	public Paciente(int id, Endereco endereco, char sexo, LocalDate dataNascimento, String email, String nome,
			String senha, String tipoSanguineo, double altura, double peso) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.nome = nome;
		this.senha = senha;
		this.tipoSanguineo = tipoSanguineo;
		this.altura = altura;
		this.peso = peso;
	}
	public Paciente() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public char getSexo() {
		return sexo;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public String getNome() {
		return nome;
	}
	public String getSenha() {
		return senha;
	}
	public String getTipoSanguineo() {
		return tipoSanguineo;
	}
	public double getAltura() {
		return altura;
	}
	public double getPeso() {
		return peso;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
}//CLASS