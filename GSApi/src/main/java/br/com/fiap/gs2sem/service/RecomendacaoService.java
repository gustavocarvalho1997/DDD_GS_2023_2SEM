package br.com.fiap.gs2sem.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.gs2sem.dao.RecomendacaoDao;
import br.com.fiap.gs2sem.dao.ResultadoDao;
import br.com.fiap.gs2sem.exception.BadInfoException;
import br.com.fiap.gs2sem.exception.IdNotFoundException;
import br.com.fiap.gs2sem.factory.ConnectionFactory;
import br.com.fiap.gs2sem.models.Recomendacao;
import br.com.fiap.gs2sem.models.Resultado;
import br.com.fiap.gs2sem.utils.RecomendacaoUtils;

public final class RecomendacaoService {
	// Atributos
	private RecomendacaoDao recomendacaoDao;
	private ResultadoDao resultadoDao;
	
	// Construtor
	public RecomendacaoService() throws ClassNotFoundException, SQLException {
		Connection conn = ConnectionFactory.getConnection();
		recomendacaoDao = new RecomendacaoDao(conn);
		resultadoDao = new ResultadoDao(conn);
	}
	
	// Listar INICIO
	public List<Recomendacao> listar() throws SQLException {
		return recomendacaoDao.listar();
	}// Listar FIM
	
	// PesquisarPorId INICIO
	public Recomendacao pesquisarPorId(int id) throws SQLException, IdNotFoundException {
		return recomendacaoDao.pesquisarPorId(id);
	}// PesquisarPorId FIM
	
	// Cadastrar INICIO
	public void cadastrar(Recomendacao recomendacao) throws SQLException, BadInfoException {
		List<Resultado> lista = resultadoDao.listar();
		RecomendacaoUtils.checkRecomendacao(recomendacao.getRecomendacao());
		RecomendacaoUtils.checkForeignKey(lista, recomendacao.getResultado().getId());
		recomendacaoDao.cadastrar(recomendacao);
	}// Cadastrar FIM
	
	// Deletar INICIO
	public void deletar(int id) throws SQLException, IdNotFoundException {
		recomendacaoDao.deletar(id);
	}// Deletar FIM
	
	// Atualizar INICIO
	public void atualizar(Recomendacao recomendacao) throws BadInfoException, SQLException, IdNotFoundException {
		RecomendacaoUtils.checkRecomendacao(recomendacao.getRecomendacao());
		recomendacaoDao.atualizar(recomendacao);
	} // Atualizar FIM
}//CLASS