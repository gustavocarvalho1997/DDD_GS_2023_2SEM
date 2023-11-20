package br.com.fiap.gs2sem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.gs2sem.exception.IdNotFoundException;
import br.com.fiap.gs2sem.models.TipoExame;
import br.com.fiap.gs2sem.utils.TipoExameUtils;

public final class TipoExameDao {
	// Atributos
	private Connection conn;
	// Statements
	private static final String LISTAR = "SELECT * FROM T_OBS_TIPO ORDER BY ID_TIPO";
	private static final String PESQ_ID = "SELECT * FROM T_OBS_TIPO WHERE ID_TIPO = ?";
	// Construtor
	public TipoExameDao(Connection conn) {
		this.conn = conn;
	}
	
	// Listar INICIO
	public List<TipoExame> listar() throws SQLException {
		PreparedStatement stm = conn.prepareStatement(LISTAR);
		ResultSet rs = stm.executeQuery();
		List<TipoExame> lista = new ArrayList<>();
		while(rs.next()) {
			TipoExame tipo = TipoExameUtils.parse(rs);
			lista.add(tipo);
		}
		return lista;
	}// Listar FIM
	
	// PesquisarPorId INICIO
	public TipoExame pesquisarPorId(int id) throws SQLException, IdNotFoundException {
		PreparedStatement stm = conn.prepareStatement(PESQ_ID);
		stm.setInt(1, id);
		ResultSet rs = stm.executeQuery();
		if(!rs.next()) {
			throw new IdNotFoundException("Id informado não foi localizado");
		}
		TipoExame tipo = TipoExameUtils.parse(rs);
		
		return tipo;
	}// PesquisarPorId FIM
}// CLASS