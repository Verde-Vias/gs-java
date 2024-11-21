package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.dao.CarroDAO;

public class TesteCadastrarCarro {
	
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
		
		Carro objCarro = new Carro();
		CarroDAO dao = new CarroDAO();
		objCarro.setIdCarro(inteiro("Insira o codigo do carro: "));
		objCarro.setMarca(texto("Insira a marca: "));
		objCarro.setModelo(texto("Insira o modelo: "));
		objCarro.setValor(real("Insira o valor: "));
		System.out.println(dao.inserir(objCarro));
	}

}

