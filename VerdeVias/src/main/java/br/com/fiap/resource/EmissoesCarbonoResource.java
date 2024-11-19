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

import br.com.fiap.beans.EmissoesCarbono;
import br.com.fiap.bo.EmissoesCarbonoBO;

@Path("/emissao")
public class EmissoesCarbonoResource {
	
	private EmissoesCarbonoBO emissoesCarbonoBO = new EmissoesCarbonoBO();
	
	// Selecionar 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<EmissoesCarbono> selecionarRs() throws ClassNotFoundException, SQLException{
		return (ArrayList<EmissoesCarbono>) emissoesCarbonoBO.selecionarBo();
	}
	
	// Inserir 
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserirRs(EmissoesCarbono emissoesCarbono, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		
		emissoesCarbonoBO.inserirBo(emissoesCarbono);
		
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(emissoesCarbono.getIdEmissao()));
		return Response.created(builder.build()).build();			
	}
	
	// Atualizar 
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizarRs(EmissoesCarbono emissoesCarbono, @PathParam("id_emissao") int idEmissao) throws ClassNotFoundException, SQLException {
		emissoesCarbonoBO.atualizarBo(emissoesCarbono);
		
		return Response.ok().build();
	}
	
	// Deletar
	@DELETE
	@Path("/{id_emissao}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("id_emissao") int idEmissao) throws ClassNotFoundException, SQLException {
		
		emissoesCarbonoBO.deletarBo(idEmissao);
		return Response.ok().build();
	}
	
}
