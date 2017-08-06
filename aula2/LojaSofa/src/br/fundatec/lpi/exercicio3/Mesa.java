package br.fundatec.lpi.exercicio3;

public class Mesa extends Movel {
	private String ds_formato;
	private Enfeite enfeite;
	
	public Mesa(String ds_codigo, String ds_descricao, String ds_formato, Enfeite enfeite) {
		super(ds_codigo, ds_descricao);
		this.ds_formato = ds_formato;
		this.enfeite = enfeite;
	}
	
	public String getDs_formato() {
		return ds_formato;
	}
	public Enfeite getEnfeite() {
		return enfeite;
	}
	public void setEnfeite(Enfeite enfeite) {
		this.enfeite = enfeite;
	}

}
