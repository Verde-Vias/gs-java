package br.com.fiap.beans;

public class TipoCombustivelOnibus {
	
	private int idTipoCombustivelOnibus;
	private String tipoCombustivelOnibus;
	public TipoCombustivelOnibus(int idTipoCombustivelOnibus, String tipoCombustivelOnibus) {
		super();
		this.idTipoCombustivelOnibus = idTipoCombustivelOnibus;
		this.tipoCombustivelOnibus = tipoCombustivelOnibus;
	}
	public TipoCombustivelOnibus() {
		super();
	}
	public int getIdTipoCombustivelOnibus() {
		return idTipoCombustivelOnibus;
	}
	public void setIdTipoCombustivelOnibus(int idTipoCombustivelOnibus) {
		this.idTipoCombustivelOnibus = idTipoCombustivelOnibus;
	}
	public String getTipoCombustivelOnibus() {
		return tipoCombustivelOnibus;
	}
	public void setTipoCombustivelOnibus(String tipoCombustivelOnibus) {
		this.tipoCombustivelOnibus = tipoCombustivelOnibus;
	}
	
	
}
