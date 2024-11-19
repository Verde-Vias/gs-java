package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.EmissoesCarbono;
import br.com.fiap.dao.EmissoesCarbonoDAO;

public class TesteSelecionarEmissoesCarbono {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//Instanciar objetos 
		EmissoesCarbonoDAO dao = new EmissoesCarbonoDAO();
		
		List<EmissoesCarbono> listaEmissoesCarbono = (ArrayList<EmissoesCarbono>) dao.selecionar();
		
		if(listaEmissoesCarbono != null) {
			// foreach 
			for( EmissoesCarbono emissoesCarbono : listaEmissoesCarbono) {
				System.out.println(emissoesCarbono.getIdEmissao() + " | " + 
									emissoesCarbono.getEmissao() + " | ");
			}
		}

	}

}
