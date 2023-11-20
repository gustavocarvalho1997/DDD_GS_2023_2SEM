package br.com.fiap.gs2sem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.gs2sem.models.Resultado;
import br.com.fiap.gs2sem.utils.ResultadoUtils;

public final class ResultadoDao {
	// Atributos
	private Connection conn;
	// Statements
	private static final String LISTAR = "SELECT * FROM T_OBS_RESULTADO ORDER BY ID_RESULTADO";
	// Construtor
	public ResultadoDao(Connection conn) {
		this.conn = conn;
	}
	
	// Listar INICIO
	public List<Resultado> listar() throws SQLException {
		PreparedStatement stm = conn.prepareStatement(LISTAR);
		ResultSet rs = stm.executeQuery();
		List<Resultado> lista = new ArrayList<>();
		while(rs.next()) {
			Resultado result = ResultadoUtils.parse(rs);
			lista.add(result);
		}
		return lista;
	}// Listar FIM
}//CLASS