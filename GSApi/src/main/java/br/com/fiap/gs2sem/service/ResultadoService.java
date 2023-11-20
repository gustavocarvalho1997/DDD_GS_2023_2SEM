package br.com.fiap.gs2sem.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.gs2sem.dao.ResultadoDao;
import br.com.fiap.gs2sem.factory.ConnectionFactory;
import br.com.fiap.gs2sem.models.Resultado;

public final class ResultadoService {
	// Atributos
	private ResultadoDao resultadoDao;
	
	// Construtor
	public ResultadoService() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		resultadoDao = new ResultadoDao(conn);
	}
	
	// Listar INICIO
	public List<Resultado> listar() throws SQLException {
		return resultadoDao.listar();
	}// Listar FIM
}//CLASS