package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.RegioesSustentaveis;
import br.com.fiap.dao.RegioesSustentaveisDAO;

public class RegioesSustentaveisBO {
	
	RegioesSustentaveisDAO regioesSustentaveisDao;
	
	// Selecionar 
	public ArrayList<RegioesSustentaveis> selecionarBo() throws ClassNotFoundException, SQLException{
		regioesSustentaveisDao = new RegioesSustentaveisDAO();
		
		return (ArrayList<RegioesSustentaveis>) regioesSustentaveisDao.selecionar();
	}
	
	// Inserir 
	public void inserirBo(RegioesSustentaveis regioesSustentaveis) throws ClassNotFoundException, SQLException {
		RegioesSustentaveisDAO regioesSustentaveisDAO = new RegioesSustentaveisDAO();
		
		
		regioesSustentaveisDAO.inserir(regioesSustentaveis);
	}
	
	// Atualizar 
	public void atualizarBo(RegioesSustentaveis regioesSustentaveis) throws ClassNotFoundException, SQLException {
		RegioesSustentaveisDAO regioesSustentaveisDAO = new RegioesSustentaveisDAO();
		
		
		regioesSustentaveisDAO.atualizar(regioesSustentaveis);
	}
	
	
	// Deletar 
	public void deletarBo(int idRegiao) throws ClassNotFoundException, SQLException {
		RegioesSustentaveisDAO regioesSustentaveisDAO = new RegioesSustentaveisDAO();
		
		
		regioesSustentaveisDAO.deletar(idRegiao);
	}		

}

