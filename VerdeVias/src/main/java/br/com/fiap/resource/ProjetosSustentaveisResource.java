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

import br.com.fiap.beans.ProjetosSustentaveis;
import br.com.fiap.bo.ProjetosSustentaveisBO;

@Path("/projetos")
public class ProjetosSustentaveisResource {
	
	private ProjetosSustentaveisBO projetosSustentaveisBO = new ProjetosSustentaveisBO();
	
	// Selecionar 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<ProjetosSustentaveis> selecionarRs() throws ClassNotFoundException, SQLException{
		return (ArrayList<ProjetosSustentaveis>) projetosSustentaveisBO.selecionarBo();
	}
	
	// Inserir 
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserirRs(ProjetosSustentaveis projetosSustentaveis, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		
		projetosSustentaveisBO.inserirBo(projetosSustentaveis);
		
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(projetosSustentaveis.getIdProjeto()));
		return Response.created(builder.build()).build();			
	}
	
	// Atualizar 
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizarRs(ProjetosSustentaveis projetosSustentaveis, @PathParam("idProjeto") int idProjeto) throws ClassNotFoundException, SQLException {
		projetosSustentaveisBO.atualizarBo(projetosSustentaveis);
		
		return Response.ok().build();
	}
	
	// Deletar
	@DELETE
	@Path("/{idProjeto}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("idProjeto") int idProjeto) throws ClassNotFoundException, SQLException {
		
		projetosSustentaveisBO.deletarBo(idProjeto);
		return Response.ok().build();
	}
	
}
