package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.EmissoesCarbono;
import br.com.fiap.dao.EmissoesCarbonoDAO;

public class TesteCadastrarEmissoesCarbono {
	
	// String
		public static String texto(String j) {
			return JOptionPane.showInputDialog(j);
		}

		// Double
		public static double real(String j) {
			return Double.parseDouble(JOptionPane.showInputDialog(j));
		}

		// Integer
		public static int inteiro(String j) {
			return Integer.parseInt(JOptionPane.showInputDialog(j));

		}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		EmissoesCarbono objEmissoesCarbono = new EmissoesCarbono();
		EmissoesCarbonoDAO dao = new EmissoesCarbonoDAO();
		objEmissoesCarbono.setIdEmissao(inteiro("Insira o codigo da emissao: "));
		objEmissoesCarbono.setEmissao(real("Insira a quantidade de emissao: "));
		
		System.out.println(dao.inserir(objEmissoesCarbono));
	}

}
