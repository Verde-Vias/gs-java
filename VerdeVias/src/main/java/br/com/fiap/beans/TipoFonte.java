package br.com.fiap.beans;

public class TipoFonte {
	
	private int idTipoFonte;
	private String nome;
	
	
	public TipoFonte(int idTipoFonte, String nome) {
		super();
		this.idTipoFonte = idTipoFonte;
		this.nome = nome;
	}

	public TipoFonte() {
		super();
	}

	public int getIdTipoFonte() {
		return idTipoFonte;
	}

	public void setIdTipoFonte(int idTipoFonte) {
		this.idTipoFonte = idTipoFonte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
