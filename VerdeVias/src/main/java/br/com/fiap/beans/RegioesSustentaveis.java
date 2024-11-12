package br.com.fiap.beans;

public class RegioesSustentaveis {
	
	private int idRegiao;
	private String nome;
	
	public RegioesSustentaveis() {
		super();
	}
	public RegioesSustentaveis(int idRegiao, String nome) {
		super();
		this.idRegiao = idRegiao;
		this.nome = nome;
	}
	public int getIdRegiao() {
		return idRegiao;
	}
	public void setIdRegiao(int idRegiao) {
		this.idRegiao = idRegiao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
