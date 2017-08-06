package br.fundatec.lpi.exercicio3;

public abstract class Movel {
	private String ds_codigo;
	private String ds_descricao;
	public Movel(String ds_codigo, String ds_descricao) {
		super();
		this.ds_codigo = ds_codigo;
		this.ds_descricao = ds_descricao;
	}
	public String getDs_codigo() {
		return ds_codigo;
	}
	public String getDs_descricao() {
		return ds_descricao;
	}
	
	
}
