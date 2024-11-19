package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.TipoFonte;
import br.com.fiap.dao.TipoFonteDAO;

public class TipoFonteBO {
	
	TipoFonteDAO tipoFonteDao;
	
	// Selecionar 
	public ArrayList<TipoFonte> selecionarBo() throws ClassNotFoundException, SQLException{
		tipoFonteDao = new TipoFonteDAO();
		
		return (ArrayList<TipoFonte>) tipoFonteDao.selecionar();
	}
	
	// Inserir 
	public void inserirBo(TipoFonte tipoFonte) throws ClassNotFoundException, SQLException {
		TipoFonteDAO tipoFonteDAO = new TipoFonteDAO();
		
		
		tipoFonteDAO.inserir(tipoFonte);
	}
	
	// Atualizar 
	public void atualizarBo(TipoFonte tipoFonte) throws ClassNotFoundException, SQLException {
		TipoFonteDAO tipoFonteDAO = new TipoFonteDAO();
		
		
		tipoFonteDAO.atualizar(tipoFonte);
	}
	
	
	// Deletar 
	public void deletarBo(int idTipoFonte) throws ClassNotFoundException, SQLException {
		TipoFonteDAO tipoFonteDAO = new TipoFonteDAO();
		
		
		tipoFonteDAO.deletar(idTipoFonte);
	}		

}

