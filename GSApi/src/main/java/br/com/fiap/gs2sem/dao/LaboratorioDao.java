package br.com.fiap.gs2sem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.gs2sem.exception.IdNotFoundException;
import br.com.fiap.gs2sem.models.Laboratorio;
import br.com.fiap.gs2sem.utils.LaboratorioUtils;

public final class LaboratorioDao {
	// Atributos
	private Connection conn;
	// Statements
	private static final String LISTAR = "SELECT LAB.ID_LABORATORIO, LAB.NM_LABORATORIO, LAB.NR_TELEFONE, LAB.NR_CNPJ, LAB.DS_RAZAO_SOCIAL, LAB.DS_EMAIL, LAB.NM_RESPONSAVEL_TECNICO, END.ID_ENDERECO, END.ID_LOGRADOURO, END.NR_LOGRADOURO, END.DS_COMPLEMENTO, L.ID_BAIRRO, L.NM_LOGRADOURO, L.NR_CEP, B.ID_CIDADE, B.NM_BAIRRO, B.NM_ZONA, C.ID_ESTADO, C.NM_CIDADE, C.NR_DDD, EST.SG_ESTADO, EST.NM_ESTADO FROM T_OBS_LABORATORIO LAB INNER JOIN T_OBS_ENDERECO END ON (LAB.ID_ENDERECO = END.ID_ENDERECO) INNER JOIN T_OBS_LOGRADOURO L ON (END.ID_LOGRADOURO = L.ID_LOGRADOURO) INNER JOIN T_OBS_BAIRRO B ON (L.ID_BAIRRO = B.ID_BAIRRO) INNER JOIN T_OBS_CIDADE C ON (B.ID_CIDADE = C.ID_CIDADE) INNER JOIN T_OBS_ESTADO EST ON (C.ID_ESTADO = EST.ID_ESTADO)";
	private static final String PESQ_ID = "SELECT LAB.ID_LABORATORIO, LAB.NM_LABORATORIO, LAB.NR_TELEFONE, LAB.NR_CNPJ, LAB.DS_RAZAO_SOCIAL, LAB.DS_EMAIL, LAB.NM_RESPONSAVEL_TECNICO, END.ID_ENDERECO, END.ID_LOGRADOURO, END.NR_LOGRADOURO, END.DS_COMPLEMENTO, L.ID_BAIRRO, L.NM_LOGRADOURO, L.NR_CEP, B.ID_CIDADE, B.NM_BAIRRO, B.NM_ZONA, C.ID_ESTADO, C.NM_CIDADE, C.NR_DDD, EST.SG_ESTADO, EST.NM_ESTADO FROM T_OBS_LABORATORIO LAB INNER JOIN T_OBS_ENDERECO END ON (LAB.ID_ENDERECO = END.ID_ENDERECO) INNER JOIN T_OBS_LOGRADOURO L ON (END.ID_LOGRADOURO = L.ID_LOGRADOURO) INNER JOIN T_OBS_BAIRRO B ON (L.ID_BAIRRO = B.ID_BAIRRO) INNER JOIN T_OBS_CIDADE C ON (B.ID_CIDADE = C.ID_CIDADE) INNER JOIN T_OBS_ESTADO EST ON (C.ID_ESTADO = EST.ID_ESTADO) WHERE ID_LABORATORIO = ?";
	// Construtor
	public LaboratorioDao(Connection conn) {
		this.conn = conn;
	}
	
	
	// Listar INICIO
	public List<Laboratorio> listar() throws SQLException{
		PreparedStatement stm = conn.prepareStatement(LISTAR);
		ResultSet rs = stm.executeQuery();
		List<Laboratorio> lista = new ArrayList<>();
		while(rs.next()) {
			Laboratorio lab = LaboratorioUtils.parse(rs);
			lista.add(lab);
		}
		return lista;
	}// Listar FIM
	
	// PesquisarPorId INICIO
	public Laboratorio pesquisarPorId(int id) throws SQLException, IdNotFoundException {
		PreparedStatement stm = conn.prepareStatement(PESQ_ID);
		stm.setInt(1, id);
		ResultSet rs = stm.executeQuery();
		if(!rs.next()) {
			throw new IdNotFoundException("Id informado não foi localizado");
		}
		Laboratorio lab = LaboratorioUtils.parse(rs);
		return lab;
	}// PesquisarPorId FIM
}//CLASS