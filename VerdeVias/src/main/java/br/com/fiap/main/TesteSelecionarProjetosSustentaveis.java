package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.ProjetosSustentaveis;
import br.com.fiap.dao.ProjetosSustentaveisDAO;

public class TesteSelecionarProjetosSustentaveis {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Instanciar objetos 
		ProjetosSustentaveisDAO dao = new ProjetosSustentaveisDAO();
		
		List<ProjetosSustentaveis> listaProjetosSustentaveis = (ArrayList<ProjetosSustentaveis>) dao.selecionar();
		
		if(listaProjetosSustentaveis != null) {
			// foreach 
			for( ProjetosSustentaveis projetosSustentaveis : listaProjetosSustentaveis) {
				System.out.println(projetosSustentaveis.getIdProjeto() + " | " + 
						projetosSustentaveis.getDescricao() + " | " + 
						projetosSustentaveis.getCusto() + " | " + 
						projetosSustentaveis.getStatus() + " | ");
			}
		}

	}

}
