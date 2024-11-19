package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.RegioesSustentaveis;
import br.com.fiap.dao.RegioesSustentaveisDAO;

public class TesteDeletarRegioesSustentaveis {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos 
		RegioesSustentaveis objRegioesSustentaveis = new RegioesSustentaveis();
		
		RegioesSustentaveisDAO dao = new RegioesSustentaveisDAO();
		
		objRegioesSustentaveis.setIdRegiao(inteiro("Digite o codigo da regiao a ser deletada: "));
		
		System.out.println(dao.deletar(objRegioesSustentaveis.getIdRegiao()));

	}

}
