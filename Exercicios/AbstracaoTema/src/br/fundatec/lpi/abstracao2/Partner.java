package br.fundatec.lpi.abstracao2;

public class Partner extends Ticket {

	public Partner(double nr_price) {
		super(nr_price);
	}

	@Override
	public double modifyTicket() {
		return this.nr_price * 0.25;
	}

}
