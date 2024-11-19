package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.RegioesSustentaveis;
import br.com.fiap.dao.RegioesSustentaveisDAO;

public class TesteSelecionarRegioesSustentaveis {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Instanciar objetos 
		RegioesSustentaveisDAO dao = new RegioesSustentaveisDAO();
		
		List<RegioesSustentaveis> listaRegioesSustentaveis = (ArrayList<RegioesSustentaveis>) dao.selecionar();
		
		if(listaRegioesSustentaveis != null) {
			// foreach 
			for( RegioesSustentaveis regioesSustentaveis : listaRegioesSustentaveis) {
				System.out.println(regioesSustentaveis.getIdRegiao() + " | " + 
									regioesSustentaveis.getNome() + " | ");
			}
		}

	}

}
