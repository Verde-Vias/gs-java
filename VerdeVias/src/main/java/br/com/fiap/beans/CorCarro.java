package br.com.fiap.beans;

public class CorCarro {
	
	private int idCorCarro;
	private String corCarro;
	
	public CorCarro() {
		super();
	}
	public CorCarro(int idCorCarro, String corCarro) {
		super();
		this.idCorCarro = idCorCarro;
		this.corCarro = corCarro;
	}
	public int getIdCorCarro() {
		return idCorCarro;
	}
	public void setIdCorCarro(int idCorCarro) {
		this.idCorCarro = idCorCarro;
	}
	public String getCorCarro() {
		return corCarro;
	}
	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}
}
