package br.com.fiap.gs2sem.resource;

import java.sql.SQLException;

import br.com.fiap.gs2sem.exception.IdNotFoundException;
import br.com.fiap.gs2sem.exception.InvalidCredentialsException;
import br.com.fiap.gs2sem.models.Endereco;
import br.com.fiap.gs2sem.service.EnderecoPacienteService;
import br.com.fiap.gs2sem.utils.AuthUtils;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

@Path("/paciente/endereco")
public final class EnderecoPacienteResource {
	// Atributo
	private EnderecoPacienteService service;
	
	// Construtor
	public EnderecoPacienteResource() throws ClassNotFoundException, SQLException {
		service = new EnderecoPacienteService();
	}
	
	// PesquisarPorId INICIO
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response pesquisarPorId(@PathParam("id") int id, @HeaderParam("authorization") String authString) throws ClassNotFoundException, SQLException{
		try {
			String[] credentials = AuthUtils.decodeAuth(authString);
			Endereco endereco = service.pesquisarPorId(credentials[0], credentials[1], id);
			return Response.ok(endereco).build();
		} catch (IdNotFoundException e) {
			return Response.status(Status.NOT_FOUND).entity(e.getMessage()).build();
		} catch (InvalidCredentialsException e) {
			return Response.status(Status.UNAUTHORIZED).entity(e.getMessage()).build();
		}
	}// PesquisarPorId FIM
}//CLASS