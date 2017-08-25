package br.fundatec.lpi.abstracao1;

public class Chair extends Furniture {
	protected boolean bol_armRest;

	public Chair(String ds_code, double nr_value, boolean bol_armRest) {
		super(ds_code, nr_value);
		this.bol_armRest = bol_armRest;
	}

	private boolean isBol_armRest() {
		return bol_armRest;
	}
	public String getBol_armRest() {
		if(isBol_armRest()) {
			return "Have arm rest";
		}
		return "Don't have arm rest";
	}
}
