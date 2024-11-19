package br.com.fiap.main;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Carro;
import br.com.fiap.beans.CorCarro;
import br.com.fiap.beans.CorOnibus;
import br.com.fiap.beans.EmissoesCarbono;
import br.com.fiap.beans.Onibus;
import br.com.fiap.beans.ProjetosSustentaveis;
import br.com.fiap.beans.RegioesSustentaveis;
import br.com.fiap.beans.TipoCombustivel;
import br.com.fiap.beans.TipoCombustivelOnibus;
import br.com.fiap.beans.TipoFonte;

public class TesteSistema {

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

	public static void main(String[] args) {
		ArrayList<Carro> listaCarro = new ArrayList<Carro>();

		Carro objCarro = null;

		do {
			objCarro = new Carro();
			objCarro.setIdCarro(inteiro("Codigo do carro"));
			objCarro.setMarca(texto("Marca do carro"));
			objCarro.setModelo(texto("Modelo do carro"));
			objCarro.setValor(real("Valor do carro"));
			listaCarro.add(objCarro);
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar outro Carro?", "Cadastro de carros",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

		CorCarro objCorCarro = new CorCarro(inteiro("Codigo da cor do carro: "), texto("cor do carro: "));

		TipoCombustivel objTipoCombustivel = new TipoCombustivel(
				inteiro("Codigo do tipo de combustivel: "), texto("combustivel: "));

		ArrayList<Onibus> listaOnibus = new ArrayList<Onibus>();

		Onibus objOnibus = null;

		do {
			objOnibus = new Onibus();
			objOnibus.setIdOnibus(inteiro("Codigo do Onibus"));
			objOnibus.setMarca(texto("Marca do onibus"));
			objOnibus.setModelo(texto("Modelo do onibus"));
			objOnibus.setValor(real("Valor do onibus"));
			listaCarro.add(objCarro);
		} while (JOptionPane.showConfirmDialog(null, "Cadastrar outro onibus?", "Cadastro de onibus",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

		CorOnibus objCorOnibus = new CorOnibus(inteiro("Codigo da cor do onibus: "), texto("cor do onibus: "));

		TipoCombustivelOnibus objTipoCombustivelOnibus = new TipoCombustivelOnibus(
				inteiro("Codigo do tipo de combustivel do onibus: "), texto("combustivel: "));

		EmissoesCarbono objEmissoesCarbono = new EmissoesCarbono(inteiro("Codigo emissao: "),
				inteiro("emissao: "));

		ProjetosSustentaveis objProjetosSustentaveis = new ProjetosSustentaveis(inteiro("Codigo do projeto: "),
				texto("Descricao do projeto: "), real("Custo do projeto: "), texto("status: "));

		RegioesSustentaveis objRegioesSustentaveis = new RegioesSustentaveis(inteiro("Codigo da regiao: "),
				texto("Nome da regiao: "));

		TipoFonte objTipoFonte = new TipoFonte(inteiro("Codigo da fonte: "), texto("Nome da fonte: "));

		
		for (Carro carro : listaCarro) {
			System.out.println("\nInformacoes sobre os Carros cadastrados" + "\nCodigo: " + carro.getIdCarro()
					+ "\nNome: " + carro.getMarca() + "\nSenha: " + carro.getModelo() + "\nCodigo do mecanico: "
					+ carro.getValor());
		}
		;
		System.out.println("\nCOR DO Carro: " + "\nCódigo da cor: " + objCorCarro.getIdCorCarro() + "\nCor: "
				+ objCorCarro.getCorCarro() + "\n\nCodigo do Tipo do combustivel: "
				+ objTipoCombustivel.getIdTipoCombustivel() + "\nCombustivel: "
				+ objTipoCombustivel.getTipoCombustivel());

		for (Onibus onibus : listaOnibus) {
			System.out.println("\nInformacoes sobre os Onibus cadastrados" + "\nCodigo: " + onibus.getIdOnibus()
					+ "\nNome: " + onibus.getMarca() + "\nSenha: " + onibus.getModelo() + "\nCodigo do mecanico: "
					+ onibus.getValor());
		}
		;

		System.out.println("\nCOR DO Onibus: " + "\nCódigo da cor: " + objCorOnibus.getIdCorOnibus() + "\nCor: "
				+ objCorOnibus.getCorOnibus() + "\nCodigo do Tipo do combustivel: "
				+ objTipoCombustivelOnibus.getIdTipoCombustivelOnibus() + "\nCombustivel: "
				+ objTipoCombustivelOnibus.getTipoCombustivelOnibus());

		System.out.println("\nInformações Sobre as Emissões de Carbono: " + "\nID da emissao: "
				+ objEmissoesCarbono.getIdEmissao() + "Emissao: " + objEmissoesCarbono.getEmissao()

				+ "\n\nInformações sobre os projetos sustentaveis: " + "\nCodigo do Projeto: "
				+ objProjetosSustentaveis.getIdProjeto() + "\nDescricao: " + objProjetosSustentaveis.getDescricao()
				+ "\nCusto: " + objProjetosSustentaveis.getCusto() + "\nStatus: " + objProjetosSustentaveis.getStatus()

				+ "\n\nInformações sobre as Regioes sustentaveis: " + "\nCodigo da regiao: "
				+ objRegioesSustentaveis.getIdRegiao() + "\nRegiao: " + objRegioesSustentaveis.getNome()

				+ "\n\nInformações sobre os Tipos de Fontes energeticas: " + "\nCodigo da fonte: "
				+ objTipoFonte.getIdTipoFonte() + "\nNome da fonte: " + objTipoFonte.getNome());
	}

}
