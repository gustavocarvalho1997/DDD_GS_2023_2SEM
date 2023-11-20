package br.com.fiap.gs2sem.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.gs2sem.dao.PacienteDao;
import br.com.fiap.gs2sem.exception.BadInfoException;
import br.com.fiap.gs2sem.exception.InvalidCredentialsException;
import br.com.fiap.gs2sem.factory.ConnectionFactory;
import br.com.fiap.gs2sem.models.Paciente;
import br.com.fiap.gs2sem.utils.PacienteUtils;

public final class PacienteService {
	// Atributos
	private PacienteDao pacienteDao;
	
	// Construtor
	public PacienteService() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		pacienteDao = new PacienteDao(conn);
	}
	
	// Autenticar INICIO
	public Paciente autenticar(String email, String senha) throws SQLException, InvalidCredentialsException {
		return pacienteDao.autenticar(email, senha);
	} // Autenticar FIM
	
	// trocarSenha INICIO
	public void trocarSenha(String email, String senha, String novaSenha) throws SQLException, InvalidCredentialsException, BadInfoException {
		Paciente p = autenticar(email, senha);
		PacienteUtils.checkPassword(novaSenha);
		p.setSenha(novaSenha);
		pacienteDao.trocarSenha(p);
	}// trocarSenha FIM
}//CLASS