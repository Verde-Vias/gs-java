package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.TipoFonte;
import br.com.fiap.dao.TipoFonteDAO;

public class TesteSelecionarTipoFonte {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Instanciar objetos 
		TipoFonteDAO dao = new TipoFonteDAO();
		
		List<TipoFonte> listaTipoFonte = (ArrayList<TipoFonte>) dao.selecionar();
		
		if(listaTipoFonte != null) {
			// foreach 
			for( TipoFonte tipoFonte : listaTipoFonte) {
				System.out.println(tipoFonte.getIdTipoFonte() + " | " + 
									tipoFonte.getNome() + " | ");
			}
		}

	}

}
