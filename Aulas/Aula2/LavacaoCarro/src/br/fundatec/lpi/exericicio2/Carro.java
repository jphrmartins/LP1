package br.fundatec.lpi.exericicio2;

public class Carro {
	private String ds_marca_modelo;
	private Motorista dono;
	private int num_anoFabricacao;
	public Carro(String ds_marca_modelo, Motorista dono) {
		super();
		this.ds_marca_modelo = ds_marca_modelo;
		this.dono = dono;
	}
	public int getNum_anoFabricacao() {
		return num_anoFabricacao;
	}
	public void setNum_anoFabricacao(int num_anoFabricacao) {
		this.num_anoFabricacao = num_anoFabricacao;
	}
	public String getDs_marca_modelo() {
		return ds_marca_modelo;
	}
	public Motorista getDono() {
		return dono;
	}
	

}
