package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.ProjetosSustentaveis;
import br.com.fiap.dao.ProjetosSustentaveisDAO;

public class TesteAtualizarProjetosSustentaveis {
	
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
		ProjetosSustentaveis objProjetosSustentaveis = new ProjetosSustentaveis();
		
		ProjetosSustentaveisDAO dao = new ProjetosSustentaveisDAO();
		
		objProjetosSustentaveis.setIdProjeto(inteiro("Insira o codigo a ser alterado"));
		objProjetosSustentaveis.setDescricao(texto("Descrição: "));
		objProjetosSustentaveis.setCusto(real("Custo: "));
		objProjetosSustentaveis.setStatus(texto("Status: "));
		System.out.println(dao.atualizar(objProjetosSustentaveis));

	}
	

}
