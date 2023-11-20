package br.com.fiap.gs2sem.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.gs2sem.models.Exame;
import br.com.fiap.gs2sem.models.Resultado;

public final class ResultadoUtils {
	private ResultadoUtils() {
	}

	// PARSE INICIO
	public static Resultado parse(ResultSet rs) throws SQLException {
		int id = rs.getInt("ID_RESULTADO");
		String classificacao = rs.getString("DS_CLASSIFICACAO");
		double p1 = rs.getDouble("VL_PARAMETRO_1");
		double p2 = rs.getDouble("VL_PARAMETRO_2");
		double p3 = rs.getDouble("VL_PARAMETRO_3");
		double p4 = rs.getDouble("VL_PARAMETRO_4");
		double p5 = rs.getDouble("VL_PARAMETRO_5");
		double p6 = rs.getDouble("VL_PARAMETRO_6");
		double p7 = rs.getDouble("VL_PARAMETRO_7");
		double p8 = rs.getDouble("VL_PARAMETRO_8");
		double p9 = rs.getDouble("VL_PARAMETRO_9");
		double p10 = rs.getDouble("VL_PARAMETRO_10");
		double p11 = rs.getDouble("VL_PARAMETRO_11");
		double p12 = rs.getDouble("VL_PARAMETRO_12");
		double p13 = rs.getDouble("VL_PARAMETRO_13");
		double p14 = rs.getDouble("VL_PARAMETRO_14");
		double p15 = rs.getDouble("VL_PARAMETRO_15");
		double p16 = rs.getDouble("VL_PARAMETRO_16");
		double p17 = rs.getDouble("VL_PARAMETRO_17");
		int idExame = rs.getInt("ID_EXAME");

		Resultado resultado = new Resultado(id, classificacao, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13,
				p14, p15, p16, p17, new Exame(idExame));

		return resultado;
	}// PARSE FIM
}// CLASS