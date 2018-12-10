package br.com.test.TesteTokioMarine.bean;

import java.io.Serializable;

import br.com.test.TesteTokioMarine.abstractEntity.AbstractEntity;



public class Carro extends AbstractEntity implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private String marca;
	private String modelo;
	private Integer ano;
	private String placa;
    
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	
	public Carro(String marca, String modelo, Integer ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		
	}
	public Carro() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	 
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String toString() {
		return "{\"marca\":\"" + marca + "\", \"modelo\":\"" + modelo + "\", \"ano\":" + ano + "\"placa\":\"" + placa + "\" }";
	}
}