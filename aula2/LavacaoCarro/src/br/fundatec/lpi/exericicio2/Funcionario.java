package br.fundatec.lpi.exericicio2;

public class Funcionario {
	private String ds_nome;
	private Carro carro;
	
	public Funcionario(String ds_nome) {
		super();
		this.ds_nome = ds_nome;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public String getDs_nome() {
		return ds_nome;
	}
	
}
