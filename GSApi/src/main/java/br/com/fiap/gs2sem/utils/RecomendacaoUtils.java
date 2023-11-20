package br.com.fiap.gs2sem.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.com.fiap.gs2sem.exception.BadInfoException;
import br.com.fiap.gs2sem.models.Recomendacao;
import br.com.fiap.gs2sem.models.Resultado;

public final class RecomendacaoUtils {
	private RecomendacaoUtils() {
	}

	// PARSE INICIO
	public static Recomendacao parse(ResultSet rs) throws SQLException {
		int id = rs.getInt("ID_RECOMENDACAO");
		String recomendacao = rs.getString("DS_RECOMENDACAO");
		int idResultado = rs.getInt("ID_RESULTADO");

		Recomendacao recom = new Recomendacao(id, recomendacao, new Resultado(idResultado));

		return recom;
	}// PARSE FIM
	
	public static void checkRecomendacao(String recomendacao) throws BadInfoException {
		if(recomendacao.length() > 200 || recomendacao == null) {
			throw new BadInfoException("A recomendação não pode ter mais de 200 caracteres ou ser nula!");
		}
	}
	
	public static void checkForeignKey(List<Resultado> result, int key) throws BadInfoException {
		boolean isFKeyValid = false;
		for(Resultado r : result) {
			if(r.getId() == key) {
				isFKeyValid = true;
			}
		}
		
		if(!isFKeyValid) {
			throw new BadInfoException("O id de resultado informado não foi localizado!");
		}
	}
}// CLASS