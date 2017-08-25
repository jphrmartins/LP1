package br.fundatec.lpi.abstracao1;

public class Table extends Furniture {
	protected String ds_shape;

	public Table(String ds_code, double nr_value, String ds_shape) {
		super(ds_code, nr_value);
		this.ds_shape = ds_shape;
	}

	public String getDs_shape() {
		return ds_shape;
	}

}
