package br.fundatec.lpi.exercicio3;

public class Enfeite extends Movel{
	private String ds_material;
	
	public Enfeite(String ds_codigo, String ds_descricao, String ds_material) {
		super(ds_codigo, ds_descricao);
		this.ds_material = ds_material;
	}

	public String getDs_material() {
		return ds_material;
	}
	
}
