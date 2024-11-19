package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.TipoFonte;
import br.com.fiap.dao.TipoFonteDAO;

public class TesteDeletarTipoFonte {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos 
		TipoFonte objTipoFonte = new TipoFonte();
		
		TipoFonteDAO dao = new TipoFonteDAO();
		
		objTipoFonte.setIdTipoFonte(inteiro("Digite o codigo da fonte a ser deletada: "));
		
		System.out.println(dao.deletar(objTipoFonte.getIdTipoFonte()));

	}

}
