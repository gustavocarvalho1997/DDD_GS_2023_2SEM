package br.com.fiap.gs2sem.resource;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.gs2sem.exception.IdNotFoundException;
import br.com.fiap.gs2sem.models.Laboratorio;
import br.com.fiap.gs2sem.service.LaboratorioService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/laboratorio")
public final class LaboratorioResource {
	// Atributos
	private LaboratorioService service;
	// Construtor
	public LaboratorioResource() throws ClassNotFoundException, SQLException {
		service = new LaboratorioService();
	}
	
	// Listar INICIO
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Laboratorio> listar() throws SQLException {
		return service.listar();
	}// Listar FIM
	
	// PesquisarPorId INICIO
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response pesquisarPorId(@PathParam("id") int id) throws SQLException {
		try {
			return Response.ok(service.pesquisarPorId(id)).build();
		} catch (IdNotFoundException e) {
			return Response.status(Status.NOT_FOUND).entity(e.getMessage()).build();
		}
	}// PesquisarPorId FIM
}//CLASS