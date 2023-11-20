package br.com.fiap.gs2sem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.gs2sem.exception.IdNotFoundException;
import br.com.fiap.gs2sem.models.Endereco;
import br.com.fiap.gs2sem.utils.EnderecoUtils;

public final class EnderecoPacienteDao {
	// Atributos
	private Connection conn;
	// Statements
	private static final String PESQ_ID = "SELECT END.ID_ENDERECO, END.ID_LOGRADOURO, END.NR_LOGRADOURO, END.DS_COMPLEMENTO, L.ID_BAIRRO, L.NM_LOGRADOURO, L.NR_CEP, B.ID_CIDADE, B.NM_BAIRRO, B.NM_ZONA,  C.ID_ESTADO, C.NM_CIDADE, C.NR_DDD, EST.SG_ESTADO, EST.NM_ESTADO FROM T_OBS_ENDERECO END INNER JOIN T_OBS_LOGRADOURO L ON (END.ID_LOGRADOURO = L.ID_LOGRADOURO) INNER JOIN T_OBS_BAIRRO B ON (L.ID_BAIRRO = B.ID_BAIRRO) INNER JOIN T_OBS_CIDADE C ON (B.ID_CIDADE = C.ID_CIDADE) INNER JOIN T_OBS_ESTADO EST ON (C.ID_ESTADO = EST.ID_ESTADO) WHERE END.ID_ENDERECO = ?";
	// Construtor
	public EnderecoPacienteDao(Connection conn) {
		this.conn = conn;
	}
	
	// PesquisarPorId INICIO
	public Endereco pesquisarPorId(int id) throws SQLException, IdNotFoundException {
		PreparedStatement stm = conn.prepareStatement(PESQ_ID);
		stm.setInt(1, id);
		ResultSet rs = stm.executeQuery();
		if(!rs.next()) {
			throw new IdNotFoundException("Id informado não foi localizado!");
		}
		Endereco endereco = EnderecoUtils.parse(rs);
		return endereco;
	}// PesquisaPorId FIM
}//CLASS