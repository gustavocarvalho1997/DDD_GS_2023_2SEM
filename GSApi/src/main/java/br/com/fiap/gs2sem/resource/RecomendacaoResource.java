package br.com.fiap.gs2sem.resource;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.gs2sem.exception.BadInfoException;
import br.com.fiap.gs2sem.exception.IdNotFoundException;
import br.com.fiap.gs2sem.models.Recomendacao;
import br.com.fiap.gs2sem.service.RecomendacaoService;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;

@Path("/recomendacao")
public final class RecomendacaoResource {
	// Atributos
	private RecomendacaoService service;
	
	// Construtor
	public RecomendacaoResource() throws ClassNotFoundException, SQLException {
		service = new RecomendacaoService();
	}
	
	// Listar INICIO
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Recomendacao> listar() throws SQLException {
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
	
	// Cadastrar INICIO
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastrar(Recomendacao recomendacao, @Context UriInfo uriInfo) throws SQLException {
		try {
			service.cadastrar(recomendacao);
			UriBuilder builder = uriInfo.getAbsolutePathBuilder();
			builder.path(Integer.toString(recomendacao.getId()));
			return Response.created(builder.build()).build();
		} catch (BadInfoException e) {
			return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}// Cadastrar FIM
	
	// Deletar INICIO
	@DELETE
	@Path("/{id}")
	public Response deletar(@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		try {
			service.deletar(id);
			return Response.noContent().build();
		} catch (IdNotFoundException e) {
			return Response.status(Status.NOT_FOUND).entity(e.getMessage()).build();
		}
	}// Deletar FIM
	
	// Atualizar INICIO
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizar(Recomendacao recomendacao, @PathParam("id") int id) throws SQLException {
		try {
			recomendacao.setId(id);
			service.atualizar(recomendacao);
			return Response.ok().build();
		} catch (IdNotFoundException e) {
			return Response.status(Status.NOT_FOUND).entity(e.getMessage()).build();
		} catch (BadInfoException e) {
			return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}// Atualizar FIM
}//CLASS