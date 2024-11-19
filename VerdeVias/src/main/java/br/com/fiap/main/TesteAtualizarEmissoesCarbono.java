package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.EmissoesCarbono;
import br.com.fiap.dao.EmissoesCarbonoDAO;

public class TesteAtualizarEmissoesCarbono {
	
	static String texto (String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real (String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos
		EmissoesCarbono objEmissoesCarbono = new EmissoesCarbono();
		
		EmissoesCarbonoDAO dao = new EmissoesCarbonoDAO();
		
		objEmissoesCarbono.setIdEmissao(inteiro("Insira o codigo a ser alterado"));
		objEmissoesCarbono.setEmissao(real("Emissao: "));
		System.out.println(dao.atualizar(objEmissoesCarbono));

	}
	

}
