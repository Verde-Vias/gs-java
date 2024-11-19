package br.com.fiap.beans;

public class CorOnibus {
	
	private int idCorOnibus;
	private String corOnibus;
	public int getIdCorOnibus() {
		return idCorOnibus;
	}
	public void setIdCorOnibus(int idCorOnibus) {
		this.idCorOnibus = idCorOnibus;
	}
	public String getCorOnibus() {
		return corOnibus;
	}
	public void setCorOnibus(String corOnibus) {
		this.corOnibus = corOnibus;
	}
	public CorOnibus(int idCorOnibus, String corOnibus) {
		super();
		this.idCorOnibus = idCorOnibus;
		this.corOnibus = corOnibus;
	}
	public CorOnibus() {
		super();
	}
	
	
}
