package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.EmissoesCarbono;
import br.com.fiap.dao.EmissoesCarbonoDAO;

public class EmissoesCarbonoBO {
	
	EmissoesCarbonoDAO emissoesCarbonoDao;
	
	// Selecionar 
	public ArrayList<EmissoesCarbono> selecionarBo() throws ClassNotFoundException, SQLException{
		emissoesCarbonoDao = new EmissoesCarbonoDAO();
		
		return (ArrayList<EmissoesCarbono>) emissoesCarbonoDao.selecionar();
	}
	
	// Inserir 
	public void inserirBo(EmissoesCarbono emissoesCarbono) throws ClassNotFoundException, SQLException {
		EmissoesCarbonoDAO emissoesCarbonoDAO = new EmissoesCarbonoDAO();
		
		
		emissoesCarbonoDAO.inserir(emissoesCarbono);
	}
	
	// Atualizar 
	public void atualizarBo(EmissoesCarbono emissoesCarbono) throws ClassNotFoundException, SQLException {
		EmissoesCarbonoDAO emissoesCarbonoDAO = new EmissoesCarbonoDAO();
		
		
		emissoesCarbonoDAO.atualizar(emissoesCarbono);
	}
	
	
	// Deletar 
	public void deletarBo(int idEmissao) throws ClassNotFoundException, SQLException {
		EmissoesCarbonoDAO emissoesCarbonoDAO = new EmissoesCarbonoDAO();
		
		
		emissoesCarbonoDAO.deletar(idEmissao);
	}		

}

