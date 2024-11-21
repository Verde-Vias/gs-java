package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.dao.CarroDAO;

public class TesteAtualizarCarro {
	
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
		Carro objCarro = new Carro();
		
		CarroDAO dao = new CarroDAO();
		
		objCarro.setIdCarro(inteiro("Insira o codigo a ser alterado"));
		objCarro.setMarca(texto("Marca: "));
		objCarro.setModelo(texto("Modelo: "));
		objCarro.setValor(real("Valor: "));
		System.out.println(dao.atualizar(objCarro));

	}
	

}
