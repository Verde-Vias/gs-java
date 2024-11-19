package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.RegioesSustentaveis;
import br.com.fiap.dao.RegioesSustentaveisDAO;

public class TesteAtualizarRegioesSustentaveis {
	
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
		RegioesSustentaveis objRegioesSustentaveis = new RegioesSustentaveis();
		
		RegioesSustentaveisDAO dao = new RegioesSustentaveisDAO();
		
		objRegioesSustentaveis.setIdRegiao(inteiro("Insira o codigo a ser alterado"));
		objRegioesSustentaveis.setNome(texto("Regiao: "));
		System.out.println(dao.atualizar(objRegioesSustentaveis));

	}
	

}
