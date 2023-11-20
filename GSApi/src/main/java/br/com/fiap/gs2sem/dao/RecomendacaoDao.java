package br.com.fiap.gs2sem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.gs2sem.exception.IdNotFoundException;
import br.com.fiap.gs2sem.models.Recomendacao;
import br.com.fiap.gs2sem.utils.RecomendacaoUtils;

public final class RecomendacaoDao {
	// Atributos
	private Connection conn;
	// Statements
	private static final String LISTAR = "SELECT * FROM T_OBS_RECOMENDACAO ORDER BY ID_RECOMENDACAO";
	private static final String PESQ_ID = "SELECT * FROM T_OBS_RECOMENDACAO WHERE ID_RECOMENDACAO = ?";
	private static final String CADASTRAR = "INSERT INTO T_OBS_RECOMENDACAO (ID_RECOMENDACAO, DS_RECOMENDACAO, ID_RESULTADO) VALUES (SQ_T_OBS_RECOMENDACAO.NEXTVAL, ?, ?)";
	private static final String DELETAR = "DELETE FROM T_OBS_RECOMENDACAO WHERE ID_RECOMENDACAO = ?";
	private static final String ATUALIZAR = "UPDATE T_OBS_RECOMENDACAO SET DS_RECOMENDACAO = ? WHERE ID_RECOMENDACAO = ?";
	// Construtor
	public RecomendacaoDao(Connection conn) {
		this.conn = conn;
	}
	
	// Listar INICIO
	public List<Recomendacao> listar() throws SQLException {
		PreparedStatement stm = conn.prepareStatement(LISTAR);
		ResultSet rs = stm.executeQuery();
		List<Recomendacao> lista = new ArrayList<>();
		while(rs.next()) {
			Recomendacao recom = RecomendacaoUtils.parse(rs);
			lista.add(recom);
		}
		return lista;
	}// Listar FIM
	
	// PesquisarPorId INICIO
	public Recomendacao pesquisarPorId(int id) throws SQLException, IdNotFoundException {
		PreparedStatement stm = conn.prepareStatement(PESQ_ID);
		stm.setInt(1, id);
		ResultSet rs = stm.executeQuery();
		if(!rs.next()) {
			throw new IdNotFoundException("Id informado não foi localizado!");
		}
		Recomendacao recom =  RecomendacaoUtils.parse(rs);
		return recom;
	}// PesquisarPorId FIM
	
	// Cadastrar INICIO
	public void cadastrar(Recomendacao recomendacao) throws SQLException {
		PreparedStatement stm = conn.prepareStatement(CADASTRAR, new String[] {"ID_RECOMENDACAO"});
		stm.setString(1, recomendacao.getRecomendacao());
		stm.setInt(2, recomendacao.getResultado().getId());
		stm.executeUpdate();
		ResultSet result = stm.getGeneratedKeys();
		result.next();
		int codigo = result.getInt(1);
		recomendacao.setId(codigo);
	}// Cadastrar FIM
	
	// Deletar INICIO
	public void deletar(int id) throws SQLException, IdNotFoundException {
		pesquisarPorId(id);
		PreparedStatement stm = conn.prepareStatement(DELETAR);
		stm.setInt(1, id);
		
		stm.executeUpdate();
	}// Deletar FIM
	
	// Atualizar INICIO
	public void atualizar(Recomendacao recomendacao) throws SQLException, IdNotFoundException {
		pesquisarPorId(recomendacao.getId());
		PreparedStatement stm = conn.prepareStatement(ATUALIZAR);
		stm.setString(1, recomendacao.getRecomendacao());
		stm.setInt(2, recomendacao.getId());
		stm.executeUpdate();
	}// Atualizar FIM
}//CLASS