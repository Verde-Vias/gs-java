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

import br.com.fiap.beans.TipoFonte;
import br.com.fiap.bo.TipoFonteBO;

@Path("/tipo/fonte")
public class TipoFonteResource {
	
	private TipoFonteBO tipoFonteBO = new TipoFonteBO();
	
	// Selecionar 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<TipoFonte> selecionarRs() throws ClassNotFoundException, SQLException{
		return (ArrayList<TipoFonte>) tipoFonteBO.selecionarBo();
	}
	
	// Inserir 
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserirRs(TipoFonte tipoFonte, @Context UriInfo uriInfo ) throws ClassNotFoundException, SQLException {
		
		tipoFonteBO.inserirBo(tipoFonte);
		
		UriBuilder builder = uriInfo.getAbsolutePathBuilder();
		builder.path(Integer.toString(tipoFonte.getIdTipoFonte()));
		return Response.created(builder.build()).build();			
	}
	
	// Atualizar 
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response atualizarRs(TipoFonte tipoFonte, @PathParam("id_Tipo_Fonte") int idTipoFonte) throws ClassNotFoundException, SQLException {
		tipoFonteBO.atualizarBo(tipoFonte);
		
		return Response.ok().build();
	}
	
	// Deletar
	@DELETE
	@Path("/{id_Tipo_Fonte}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response deletarRs(@PathParam("id_Tipo_Fonte") int idTipoFonte) throws ClassNotFoundException, SQLException {
		
		tipoFonteBO.deletarBo(idTipoFonte);
		return Response.ok().build();
	}
	
}
