package br.fundatec.lpi.abstracao2;

public class OldGuy extends Ticket {

	public OldGuy(double nr_price) {
		super(nr_price);
	}

	@Override
	public double modifyTicket() {
		return this.nr_price * 0.5;
	}
}
