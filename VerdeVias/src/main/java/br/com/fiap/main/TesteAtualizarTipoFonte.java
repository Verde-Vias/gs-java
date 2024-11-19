package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.TipoFonte;
import br.com.fiap.dao.TipoFonteDAO;

public class TesteAtualizarTipoFonte {
	
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
		TipoFonte objTipoFonte = new TipoFonte();
		
		TipoFonteDAO dao = new TipoFonteDAO();
		
		objTipoFonte.setIdTipoFonte(inteiro("Insira o codigo a ser alterado"));
		objTipoFonte.setNome(texto("Fonte: "));
		System.out.println(dao.atualizar(objTipoFonte));

	}
	

}
