package br.fundatec.lpi.abstracao2;

public class Studant extends Ticket {

	public Studant(double nr_price) {
		super(nr_price);
	}

	@Override
	public double modifyTicket() {
		return this.nr_price * 0.4;
	}

}
