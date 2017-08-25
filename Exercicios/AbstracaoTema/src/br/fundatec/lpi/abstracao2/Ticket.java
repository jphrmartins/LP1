package br.fundatec.lpi.abstracao2;

public abstract class Ticket {
	protected double nr_price;

	public Ticket(double nr_price) {
		this.nr_price = nr_price;
	}

	public double getNr_price() {
		return nr_price;
	}

	public abstract double modifyTicket();
}
