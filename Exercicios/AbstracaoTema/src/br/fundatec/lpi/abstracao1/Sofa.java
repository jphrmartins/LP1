package br.fundatec.lpi.abstracao1;

public class Sofa extends Furniture {
	protected int nr_seat;

	public Sofa(String ds_code, double nr_value, int nr_seat) {
		super(ds_code, nr_value);
		this.nr_seat = nr_seat;
	}

	public int getNr_seat() {
		return nr_seat;
	}
	
}
