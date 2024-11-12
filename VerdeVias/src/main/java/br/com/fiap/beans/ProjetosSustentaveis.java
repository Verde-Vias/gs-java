package br.com.fiap.beans;

public class ProjetosSustentaveis {
	
	private int idProjeto;
	private String descricao;
	private double custo;
	private String status;
	
	public ProjetosSustentaveis(int idProjeto, String descricao, double custo, String status) {
		super();
		this.idProjeto = idProjeto;
		this.descricao = descricao;
		this.custo = custo;
		this.status = status;
	}
	public ProjetosSustentaveis() {
		super();
	}
	
	public int getIdProjeto() {
		return idProjeto;
	}
	public void setIdProjeto(int idProjeto) {
		this.idProjeto = idProjeto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
