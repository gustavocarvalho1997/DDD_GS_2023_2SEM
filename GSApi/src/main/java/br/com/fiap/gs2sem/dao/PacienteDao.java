package br.com.fiap.gs2sem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.gs2sem.exception.InvalidCredentialsException;
import br.com.fiap.gs2sem.models.Paciente;
import br.com.fiap.gs2sem.utils.PacienteUtils;

public final class PacienteDao {
	// Atributos
	private Connection conn;
	// Statements
	private static final String AUTH = "SELECT * FROM T_OBS_PACIENTE WHERE DS_EMAIL = ? AND DS_SENHA = ?";
	private static final String UP_SENHA = "UPDATE T_OBS_PACIENTE SET DS_SENHA = ? WHERE ID_PACIENTE = ?";
	// Construtor
	public PacienteDao(Connection conn) {
		this.conn = conn;
	}
	
	// Autenticar INICIO
	public Paciente autenticar(String email, String senha) throws SQLException, InvalidCredentialsException {
		PreparedStatement stm = conn.prepareStatement(AUTH);
		stm.setString(1, email);
		stm.setString(2, senha);
		
		ResultSet rs = stm.executeQuery();
		if(!rs.next()) {
			throw new InvalidCredentialsException("Email ou senha incorretos");
		}
		
		Paciente p = PacienteUtils.parse(rs);
		return p;
	}// Autenticar FIM
	
	// trocarSenha INICIO
	public void trocarSenha(Paciente paciente) throws SQLException {
		PreparedStatement stm = conn.prepareStatement(UP_SENHA);
		stm.setString(1, paciente.getSenha());
		stm.setInt(2, paciente.getId());
		
		stm.executeUpdate();
	}// trocarSenha FIM
}// CLASS