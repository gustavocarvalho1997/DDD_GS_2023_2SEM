package br.com.fiap.gs2sem.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.gs2sem.models.Bairro;
import br.com.fiap.gs2sem.models.Cidade;
import br.com.fiap.gs2sem.models.Endereco;
import br.com.fiap.gs2sem.models.Estado;
import br.com.fiap.gs2sem.models.Logradouro;
import br.com.fiap.gs2sem.models.Paciente;

public final class EnderecoUtils {
	private EnderecoUtils() {
	}
	// PARSE INICIO
		public static Endereco parse(ResultSet rs) throws SQLException {
			int idEndereco = rs.getInt("ID_ENDERECO");
			int idLogradouro = rs.getInt("ID_LOGRADOURO");
			int numeroLogradouro = rs.getInt("NR_LOGRADOURO");
			String complemento = rs.getString("DS_COMPLEMENTO");
			int idBairro = rs.getInt("ID_BAIRRO");
			String nomeLogradouro = rs.getString("NM_LOGRADOURO");
			String cep = rs.getString("NR_CEP");
			int idCidade = rs.getInt("ID_CIDADE");
			String nomeBairro = rs.getString("NM_BAIRRO");
			String zona = rs.getString("NM_ZONA");
			int idEstado = rs.getInt("ID_ESTADO");
			String nomeCidade = rs.getString("NM_CIDADE");
			int ddd = rs.getInt("NR_DDD");
			String siglaEstado = rs.getString("SG_ESTADO");
			String nomeEstado = rs.getString("NM_ESTADO");
			
			Estado estado = new Estado(idEstado, siglaEstado, nomeEstado);
			Cidade cidade = new Cidade(idCidade, estado, nomeCidade, ddd);
			Bairro bairro = new Bairro(idBairro, cidade, nomeBairro, zona);
			Logradouro logradouro =  new Logradouro(idLogradouro, bairro, nomeLogradouro, cep);
			Endereco endereco = new Endereco(idEndereco, logradouro, numeroLogradouro);
			if(complemento != null) {
				endereco.setComplemento(complemento);
			}
			
			return endereco;
		}//PARSE FIM
		
		// areCredentialsValid INICIO
		public static boolean areCredentialsValid(Paciente paciente, Endereco endereco) {
			return (paciente.getEndereco().getId() == endereco.getId());
		}// areCredentialsValid FIM
}//CLASS