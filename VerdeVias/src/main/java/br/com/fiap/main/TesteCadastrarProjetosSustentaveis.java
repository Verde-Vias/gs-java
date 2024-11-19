package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.ProjetosSustentaveis;
import br.com.fiap.dao.ProjetosSustentaveisDAO;

public class TesteCadastrarProjetosSustentaveis {
	
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
		
		ProjetosSustentaveis objProjetosSustentaveis = new ProjetosSustentaveis();
		ProjetosSustentaveisDAO dao = new ProjetosSustentaveisDAO();
		objProjetosSustentaveis.setIdProjeto(inteiro("Insira o codigo do projeto: "));
		objProjetosSustentaveis.setDescricao(texto("Insira a descricao: "));
		objProjetosSustentaveis.setCusto(real("Insira o custo: "));
		objProjetosSustentaveis.setStatus(texto("Insira o status do projeto: "));
		System.out.println(dao.inserir(objProjetosSustentaveis));
	}

}
