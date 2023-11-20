package br.com.fiap.gs2sem.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import br.com.fiap.gs2sem.exception.BadInfoException;
import br.com.fiap.gs2sem.models.Endereco;
import br.com.fiap.gs2sem.models.Paciente;

public final class PacienteUtils {
	private PacienteUtils() {
	}
	
	// INICIO PARSE
	public static Paciente parse(ResultSet rs) throws SQLException {
		int id = rs.getInt("ID_PACIENTE");
		char sexo = rs.getString("FL_SEXO_BIOLOGICO").charAt(0);
		LocalDate dataNascimento = rs.getObject("DT_NASCIMENTO", LocalDate.class);
		String email = rs.getString("DS_EMAIL");
		String nome = rs.getString("NM_PESSOA");
		String senha = rs.getString("DS_SENHA");
		String tipoSanguineo = rs.getString("TP_SANGUINEO");
		double altura = rs.getDouble("NR_ALTURA");
		double peso = rs.getDouble("NR_PESO");
		int idEndereco = rs.getInt("ID_ENDERECO");
		
		Paciente p = new Paciente(id, new Endereco(idEndereco), sexo, dataNascimento, email, nome, senha, tipoSanguineo, altura, peso);
		return p;
	}// PARSE FIM
	
	// checkPassword INICIO
	public static void checkPassword (String password) throws BadInfoException {
		if(password == null) {
			throw new BadInfoException("A senha não pode ficar em branco!");
		}
		if(password.length() <= 4 || password.length() > 10) {
			throw new BadInfoException("A senha deve conter de 5 a 10 caracteres!");
		}
	}// checkPassword FIM
}//CLASS