package br.com.fiap.beans;

public class Carro {
	
	private int idCarro;
	private String marca;
	private String modelo;
	private double valor;
	private String tipoCombustivel;
	private String corCarro;
	
	public Carro() {
		super();
	}

	public Carro(int idCarro, String marca, String modelo, double valor, String tipoCombustivel, String corCarro) {
		super();
		this.idCarro = idCarro;
		this.marca = marca;
		this.modelo = modelo;
		this.valor = valor;
		this.tipoCombustivel = tipoCombustivel;
		this.corCarro = corCarro;
	}

	public int getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(int idCarro) {
		this.idCarro = idCarro;
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

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getCorCarro() {
		return corCarro;
	}

	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}
	
	
	
}