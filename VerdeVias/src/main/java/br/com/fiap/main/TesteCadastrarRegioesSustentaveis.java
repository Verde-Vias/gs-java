package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.RegioesSustentaveis;
import br.com.fiap.dao.RegioesSustentaveisDAO;

public class TesteCadastrarRegioesSustentaveis {
	
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
		
		RegioesSustentaveis objRegioesSustentaveis = new RegioesSustentaveis();
		RegioesSustentaveisDAO dao = new RegioesSustentaveisDAO();
		
		objRegioesSustentaveis.setIdRegiao(inteiro("codigo: "));
		objRegioesSustentaveis.setNome(texto("regiao: "));
		System.out.println(dao.inserir(objRegioesSustentaveis));
	}

}
