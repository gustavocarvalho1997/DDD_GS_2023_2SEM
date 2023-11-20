package br.com.fiap.gs2sem.resource;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.gs2sem.models.Resultado;
import br.com.fiap.gs2sem.service.ResultadoService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/resultados")
public final class ResultadoResource {
	// Atributos
	private ResultadoService service;
	
	// Construtor
	public ResultadoResource() throws ClassNotFoundException, SQLException {
		service = new ResultadoService();
	}
	
	//Listar INICIO
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Resultado> listar() throws SQLException {
		return service.listar();
	}// Listar FIM
}//CLASS