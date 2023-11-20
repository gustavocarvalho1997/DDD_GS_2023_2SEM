package br.com.fiap.gs2sem.service;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.fiap.gs2sem.dao.EnderecoPacienteDao;
import br.com.fiap.gs2sem.dao.PacienteDao;
import br.com.fiap.gs2sem.exception.IdNotFoundException;
import br.com.fiap.gs2sem.exception.InvalidCredentialsException;
import br.com.fiap.gs2sem.factory.ConnectionFactory;
import br.com.fiap.gs2sem.models.Endereco;
import br.com.fiap.gs2sem.models.Paciente;
import br.com.fiap.gs2sem.utils.EnderecoUtils;

public final class EnderecoPacienteService {
	// Atributos
	private EnderecoPacienteDao enderecoPacienteDao;
	private PacienteDao pacienteDao;
	// Construtor
	public EnderecoPacienteService() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		enderecoPacienteDao = new EnderecoPacienteDao(conn);
		pacienteDao = new PacienteDao(conn);
	}
	
	// PesquisarPorId INICIO
	public Endereco pesquisarPorId(String email, String senha, int id) throws SQLException, IdNotFoundException, InvalidCredentialsException {
		Endereco endereco = enderecoPacienteDao.pesquisarPorId(id);
		Paciente paciente = pacienteDao.autenticar(email, senha);
		boolean isValid = EnderecoUtils.areCredentialsValid(paciente, endereco);
		if(!isValid) {
			throw new InvalidCredentialsException("O endereco em questão, não pertence a este paciente!");
		}
		return endereco;
	}// PesquisarPorId FIM
}//CLASS