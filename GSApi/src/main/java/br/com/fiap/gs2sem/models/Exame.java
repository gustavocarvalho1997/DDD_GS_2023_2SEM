package br.com.fiap.gs2sem.models;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public final class Exame {
	// Atributos
	private int id;
	private String especializacao;
	@JsonFormat(pattern = "dd/MM/yyyy", shape = JsonFormat.Shape.STRING)
	private LocalDate dataRealização;
	private Laboratorio laboratorio;
	private TipoExame tipo;
	private Paciente paciente;
	
	// Construtores
	public Exame(int id, String especializacao, LocalDate dataRealização, Laboratorio laboratorio, TipoExame tipo,
			Paciente paciente) {
		super();
		this.id = id;
		this.especializacao = especializacao;
		this.dataRealização = dataRealização;
		this.laboratorio = laboratorio;
		this.tipo = tipo;
		this.paciente = paciente;
	}
	public Exame(int id) {
		super();
		this.id = id;
	}
	public Exame() {
		super();
	}
	
	// Getters
	public int getId() {
		return id;
	}
	public String getEspecializacao() {
		return especializacao;
	}
	public LocalDate getDataRealização() {
		return dataRealização;
	}
	public Laboratorio getLaboratorio() {
		return laboratorio;
	}
	public TipoExame getTipo() {
		return tipo;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	
	// Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	public void setDataRealização(LocalDate dataRealização) {
		this.dataRealização = dataRealização;
	}
	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
	public void setTipo(TipoExame tipo) {
		this.tipo = tipo;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
}//CLASS