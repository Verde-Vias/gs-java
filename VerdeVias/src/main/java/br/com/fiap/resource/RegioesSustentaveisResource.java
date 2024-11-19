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

import br.com.fiap.beans.RegioesSustentaveis;
import br.com.fiap.bo.RegioesSustentaveisBO;

@Path("/regioes")
public class RegioesSustentaveisResource {
	
	private RegioesSustentaveisBO regioesSustentaveisBO = new RegioesSustentaveisBO();
	
	// Selecionar 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<RegioesSustentaveis> selecionarRs() throws ClassNotFoundException, SQLException{
		return (ArrayList<RegioesSustentaveis>) regioesSustentaveisBO.selecionarBo();
	}
	
	// Inserir 
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserirRs(RegioesSustentaveis regioesSustentaveis, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		
		regioesSustentaveisBO.inserirBo(regioesSustentaveis);
		
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(regioesSustentaveis.getIdRegiao()));
		return Response.created(builder.build()).build();			
	}
	
	// Atualizar 
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizarRs(RegioesSustentaveis regioesSustentaveis, @PathParam("id_regiao") int idRegiao) throws ClassNotFoundException, SQLException {
		regioesSustentaveisBO.atualizarBo(regioesSustentaveis);
		
		return Response.ok().build();
	}
	
	// Deletar
	@DELETE
	@Path("/{id_regiao}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("id_regiao") int idRegiao) throws ClassNotFoundException, SQLException {
		
		regioesSustentaveisBO.deletarBo(idRegiao);
		return Response.ok().build();
	}
	
}
