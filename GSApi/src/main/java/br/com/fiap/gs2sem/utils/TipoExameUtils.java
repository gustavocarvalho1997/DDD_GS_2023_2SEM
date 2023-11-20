package br.com.fiap.gs2sem.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.gs2sem.models.TipoExame;

public final class TipoExameUtils {
	private TipoExameUtils() {
	}
	
	// PARSE INICIO
	public static TipoExame parse(ResultSet rs) throws SQLException {
		int id = rs.getInt("ID_TIPO");
		String nome = rs.getString("NM_TIPO");
		
		TipoExame tp = new TipoExame(id, nome);
		return tp;
	}// PARSE FIM
}//CLASS