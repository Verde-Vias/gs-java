package br.com.fiap.beans;

public class TipoCombustivel {
	
	private int idTipoCombustivel;
	private String tipoCombustivel;
	
	public TipoCombustivel(int idTipoCombustivel, String tipoCombustivel) {
		super();
		this.idTipoCombustivel = idTipoCombustivel;
		this.tipoCombustivel = tipoCombustivel;
	}
	public TipoCombustivel() {
		super();
	}
	public int getIdTipoCombustivel() {
		return idTipoCombustivel;
	}
	public void setIdTipoCombustivel(int idTipoCombustivel) {
		this.idTipoCombustivel = idTipoCombustivel;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
}
