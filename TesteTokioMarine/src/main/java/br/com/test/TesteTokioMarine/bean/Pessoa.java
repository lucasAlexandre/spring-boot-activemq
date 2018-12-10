package br.com.test.TesteTokioMarine.bean;

import br.com.test.TesteTokioMarine.abstractEntity.AbstractEntity;

public class Pessoa extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nome;

	private String cpf;


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "{\"nome\":\"" + nome + "\", \"cpf\":\"" + cpf +"\"}";
	}
}
