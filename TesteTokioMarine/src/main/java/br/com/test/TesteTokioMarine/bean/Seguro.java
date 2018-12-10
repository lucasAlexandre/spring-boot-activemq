package br.com.test.TesteTokioMarine.bean;

import br.com.test.TesteTokioMarine.abstractEntity.AbstractEntity;

public class Seguro extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Carro carro;
	
	private Pessoa pessoa;
	
	
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	@Override
	public String toString() {
		
		
		String seg = new String();

		// me perdoe!
		seg = "{\"carro\":{\"marca\":\"" +this.carro.getMarca()+"\",\"modelo\":\""+this.carro.getModelo()+"\", \"ano\":"
		+Integer.toString(this.carro.getAno())+ ",\"placa\":\"" + (this.carro.getPlaca()) + "\""+"},\"pessoa\":{\"nome\":\""
		+this.pessoa.getNome()+"\",\"cpf\":\""+this.pessoa.getCpf()+"\"}}}";
		
		return seg;
	}
	
}
