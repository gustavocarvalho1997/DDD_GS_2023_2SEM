package br.com.fiap.gs2sem.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.gs2sem.dao.TipoExameDao;
import br.com.fiap.gs2sem.exception.IdNotFoundException;
import br.com.fiap.gs2sem.factory.ConnectionFactory;
import br.com.fiap.gs2sem.models.TipoExame;

public final class TipoExameService {
	// Atributos
	private TipoExameDao tipoExameDao;
	
	// Construtor
	public TipoExameService() throws SQLException, ClassNotFoundException {
		Connection conn = ConnectionFactory.getConnection();
		tipoExameDao = new TipoExameDao(conn);
	}
	
	// Listar INICIO
	public List<TipoExame> listar() throws SQLException {
		return tipoExameDao.listar();
	}// Listar FIM
	
	// PesquisarPorId INICIO
	public TipoExame pesquisarPorId(int id) throws SQLException, IdNotFoundException {
		return tipoExameDao.pesquisarPorId(id);
	}// PesquisarPorId FIM
}//CLASS