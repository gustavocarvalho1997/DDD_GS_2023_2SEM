package br.com.fiap.gs2sem.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.gs2sem.dao.LaboratorioDao;
import br.com.fiap.gs2sem.exception.IdNotFoundException;
import br.com.fiap.gs2sem.factory.ConnectionFactory;
import br.com.fiap.gs2sem.models.Laboratorio;

public final class LaboratorioService {
	// Atributos
	private LaboratorioDao laboratorioDao;
	// Construtor
	public LaboratorioService() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		laboratorioDao = new LaboratorioDao(conn);
	}
	
	// Listar INICIO
	public List<Laboratorio> listar() throws SQLException {
		return laboratorioDao.listar();
	} // Listar FIM
	
	// PesquisarPorId INICIO
	public Laboratorio pesquisarPorId(int id) throws SQLException, IdNotFoundException {
		return laboratorioDao.pesquisarPorId(id);
	}// PesquisarPorId FIM
}//CLASS