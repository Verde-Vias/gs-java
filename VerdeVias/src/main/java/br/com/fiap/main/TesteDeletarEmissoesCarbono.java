package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.EmissoesCarbono;
import br.com.fiap.dao.EmissoesCarbonoDAO;

public class TesteDeletarEmissoesCarbono {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos 
		EmissoesCarbono objEmissoesCarbono = new EmissoesCarbono();
		
		EmissoesCarbonoDAO dao = new EmissoesCarbonoDAO();
		
		objEmissoesCarbono.setIdEmissao(inteiro("Digite o codigo da emissao a ser deletada: "));
		
		System.out.println(dao.deletar(objEmissoesCarbono.getIdEmissao()));

	}

}
