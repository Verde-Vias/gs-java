package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.TipoFonte;
import br.com.fiap.dao.TipoFonteDAO;

public class TesteCadastrarTipoFonte {
	
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
		
		TipoFonte objTipoFonte = new TipoFonte();
		TipoFonteDAO dao = new TipoFonteDAO();
		objTipoFonte.setIdTipoFonte(inteiro("Insira o codigo da fonte: "));
		objTipoFonte.setNome(texto("Insira a fonte: "));
		System.out.println(dao.inserir(objTipoFonte));
	}

}
