package br.com.fiap.gs2sem.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.gs2sem.models.Endereco;
import br.com.fiap.gs2sem.models.Laboratorio;

public final class LaboratorioUtils {
	private LaboratorioUtils() {
	}
	
	// PARSE INICIO
	public static Laboratorio parse(ResultSet rs) throws SQLException {
		Endereco endereco = EnderecoUtils.parse(rs);
		int id = rs.getInt("ID_LABORATORIO");
		String nome = rs.getString("NM_LABORATORIO");
		String telefone = rs.getString("NR_TELEFONE");
		String cnpj = rs.getString("NR_CNPJ");
		String razaoSocial = rs.getString("DS_RAZAO_SOCIAL");
		String email = rs.getString("DS_EMAIL");
		String responsavelTecnico = rs.getString("NM_RESPONSAVEL_TECNICO");
		
		Laboratorio lab = new Laboratorio(id, endereco, nome, telefone, cnpj, razaoSocial, email, responsavelTecnico);
		
		return lab;
	}// PARSE FIM
}//CLASS