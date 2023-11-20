package br.com.fiap.gs2sem.resource;

import java.sql.SQLException;

import br.com.fiap.gs2sem.exception.BadInfoException;
import br.com.fiap.gs2sem.exception.InvalidCredentialsException;
import br.com.fiap.gs2sem.models.Paciente;
import br.com.fiap.gs2sem.service.PacienteService;
import br.com.fiap.gs2sem.utils.AuthUtils;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/paciente")
public final class PacienteResource {
	// Atributos
	private PacienteService service;
	
	// Construtor
	public PacienteResource() throws ClassNotFoundException, SQLException {
		service = new PacienteService();
	}
	
	// Autenticar INICIO
	@GET
	@Path("/auth")
	@Produces(MediaType.APPLICATION_JSON)
	public Response autenticar(@HeaderParam("authorization") String authString) throws SQLException {
		try {
			String[] credentials = AuthUtils.decodeAuth(authString);
			return Response.ok(service.autenticar(credentials[0], credentials[1])).build();
		} catch (InvalidCredentialsException e) {
			return Response.status(Status.UNAUTHORIZED).entity(e.getMessage()).build();
		}
	}// Autenticar FIM
	
	// trocarSenha INICIO
	@PUT
	@Path("/senha")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response trocarSenha(Paciente paciente, @HeaderParam("authorization") String authString) throws SQLException{
		try {
			String[] credentials = AuthUtils.decodeAuth(authString);
			service.trocarSenha(credentials[0], credentials[1], paciente.getSenha());
			return Response.noContent().build();
		} catch (InvalidCredentialsException e) {
			return Response.status(Status.UNAUTHORIZED).entity(e.getMessage()).build();
		} catch (BadInfoException e) {
			return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
	}
}//CLASS