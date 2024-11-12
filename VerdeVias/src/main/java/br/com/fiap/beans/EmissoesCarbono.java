package br.com.fiap.beans;

public class EmissoesCarbono {
	
	private int idEmissao;
	private double emissao;
	
	public EmissoesCarbono() {
		super();
	}

	public EmissoesCarbono(int idEmissao, double emissao) {
		super();
		this.idEmissao = idEmissao;
		this.emissao = emissao;
	}

	public int getIdEmissao() {
		return idEmissao;
	}

	public void setIdEmissao(int idEmissao) {
		this.idEmissao = idEmissao;
	}

	public double getEmissao() {
		return emissao;
	}

	public void setEmissao(double emissao) {
		this.emissao = emissao;
	}
	
	
	
}
