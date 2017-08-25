package br.fundatec.lpi.abstracao1;

public class Ornament extends Furniture {
	protected String ds_material;

	public Ornament(String ds_code, double nr_value, String ds_material) {
		super(ds_code, nr_value);
		this.ds_material = ds_material;
	}

	public String getDs_material() {
		return ds_material;
	}
}
