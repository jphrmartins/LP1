package br.fundatec.lpi.abstracao1;

public abstract class Furniture {
	protected String ds_code;
	protected double nr_value;

	public Furniture(String ds_code, double nr_value) {
		this.ds_code = ds_code;
		this.nr_value = nr_value;
	}

	public String getDs_code() {
		return ds_code;
	}

	public double getNr_value() {
		return nr_value;
	}
	

}
