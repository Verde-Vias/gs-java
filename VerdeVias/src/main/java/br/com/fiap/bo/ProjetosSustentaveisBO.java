package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.ProjetosSustentaveis;
import br.com.fiap.dao.ProjetosSustentaveisDAO;

public class ProjetosSustentaveisBO {
	
	ProjetosSustentaveisDAO projetosSustentaveisDao;
	
	// Selecionar 
	public ArrayList<ProjetosSustentaveis> selecionarBo() throws ClassNotFoundException, SQLException{
		projetosSustentaveisDao = new ProjetosSustentaveisDAO();
		
		return (ArrayList<ProjetosSustentaveis>) projetosSustentaveisDao.selecionar();
	}
	
	// Inserir 
	public void inserirBo(ProjetosSustentaveis projetosSustentaveis) throws ClassNotFoundException, SQLException {
		ProjetosSustentaveisDAO projetosSustentaveisDAO = new ProjetosSustentaveisDAO();
		
		
		projetosSustentaveisDAO.inserir(projetosSustentaveis);
	}
	
	// Atualizar 
	public void atualizarBo(ProjetosSustentaveis projetosSustentaveis) throws ClassNotFoundException, SQLException {
		ProjetosSustentaveisDAO projetosSustentaveisDAO = new ProjetosSustentaveisDAO();
		
		
		projetosSustentaveisDAO.atualizar(projetosSustentaveis);
	}
	
	
	// Deletar 
	public void deletarBo(int idProjeto) throws ClassNotFoundException, SQLException {
		ProjetosSustentaveisDAO projetosSustentaveisDAO = new ProjetosSustentaveisDAO();
		
		
		projetosSustentaveisDAO.deletar(idProjeto);
	}		

}


