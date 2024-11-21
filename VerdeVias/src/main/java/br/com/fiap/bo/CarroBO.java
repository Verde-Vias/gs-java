package br.com.fiap.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.beans.Carro;
import br.com.fiap.dao.CarroDAO;

public class CarroBO {
	
	CarroDAO carroDao;
	
	// Selecionar 
	public ArrayList<Carro> selecionarBo() throws ClassNotFoundException, SQLException{
		carroDao = new CarroDAO();
		
		return (ArrayList<Carro>) carroDao.selecionar();
	}
	
	// Inserir 
	public void inserirBo(Carro carro) throws ClassNotFoundException, SQLException {
		CarroDAO carroDAO = new CarroDAO();
		
		
		carroDAO.inserir(carro);
	}
	
	// Atualizar 
	public void atualizarBo(Carro carro) throws ClassNotFoundException, SQLException {
		CarroDAO carroDAO = new CarroDAO();
		
		
		carroDAO.atualizar(carro);
	}
	
	
	// Deletar 
	public void deletarBo(int idCarro) throws ClassNotFoundException, SQLException {
		CarroDAO carroDAO = new CarroDAO();
		
		
		carroDAO.deletar(idCarro);
	}		

}


