package br.com.fiap.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.beans.Carro;
import br.com.fiap.bo.CarroBO;

@Path("/carro")
public class CarroResource {
	
	private CarroBO carroBO = new CarroBO();
	
	// Selecionar 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Carro> selecionarRs() throws ClassNotFoundException, SQLException{
		return (ArrayList<Carro>) carroBO.selecionarBo();
	}
	
	// Inserir 
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserirRs(Carro carro, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		
		carroBO.inserirBo(carro);
		
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(carro.getIdCarro()));
		return Response.created(builder.build()).build();			
	}
	
	// Atualizar 
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizarRs(Carro carro, @PathParam("idCarro") int idCarro) throws ClassNotFoundException, SQLException {
		carroBO.atualizarBo(carro);
		
		return Response.ok().build();
	}
	
	// Deletar
	@DELETE
	@Path("/{idCarro}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("idCarro") int idCarro) throws ClassNotFoundException, SQLException {
		
		carroBO.deletarBo(idCarro);
		return Response.ok().build();
	}
	
}
