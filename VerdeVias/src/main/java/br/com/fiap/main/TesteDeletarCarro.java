package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro ;
import br.com.fiap.dao.CarroDAO;

public class TesteDeletarCarro {
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instanciar objetos 
		Carro objCarro  = new Carro ();
		
		CarroDAO dao = new CarroDAO();
		
		objCarro.setIdCarro(inteiro("Digite o codigo do carro a ser deletado: "));
		
		System.out.println(dao.deletar(objCarro.getIdCarro()));

	}

}
