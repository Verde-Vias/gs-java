package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.ProjetosSustentaveis ;
import br.com.fiap.dao.ProjetosSustentaveisDAO;

public class TesteDeletarProjetosSustentaveis {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos 
		ProjetosSustentaveis objProjetosSustentaveis  = new ProjetosSustentaveis ();
		
		ProjetosSustentaveisDAO dao = new ProjetosSustentaveisDAO();
		
		objProjetosSustentaveis.setIdProjeto(inteiro("Digite o codigo do projeto a ser deletado: "));
		
		System.out.println(dao.deletar(objProjetosSustentaveis.getIdProjeto()));

	}

}
