package br.com.fiap.beans;

public class Onibus {
	
	private int idOnibus;
	private String marca;
	private String modelo;
	private double valor;
	private String corOnibus;
	
	
	public Onibus() {
		super();
	}
	public Onibus(int idOnibus, String marca, String modelo, double valor, String corOnibus) {
		super();
		this.idOnibus = idOnibus;
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		this.corOnibus = corOnibus;
	}
	
	public int getIdOnibus() {
		return idOnibus;
	}
	public void setIdOnibus(int idOnibus) {
		this.idOnibus = idOnibus;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getCorOnibus() {
		return corOnibus;
	}
	public void setCorOnibus(String corOnibus) {
		this.corOnibus = corOnibus;
	}
	
	

	
}
