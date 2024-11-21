package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Carro;
import br.com.fiap.dao.CarroDAO;

public class TesteSelecionarCarro {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Instanciar objetos 
		CarroDAO dao = new CarroDAO();
		
		List<Carro> listaCarro = (ArrayList<Carro>) dao.selecionar();
		
		if(listaCarro != null) {
			// foreach 
			for( Carro carro : listaCarro) {
				System.out.println(carro.getIdCarro() + " | " + 
						carro.getMarca() + " | " + 
						carro.getModelo() + " | " + 
						carro.getValor() + " | ");
			}
		}

	}

}
