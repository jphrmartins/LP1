package br.casa2.lpi.interfaces.exercicio2;

/**
 * Classe que representa uma Lampada Led que tem extenção da classe abstrata
 * Led.
 * 
 * @author JP, Ti11
 *
 */
public class LedLamp extends Lamp {
	private String ds_type;

	public LedLamp(int kwH, int power, String ds_type) {
		super(kwH, power);
		this.ds_type = ds_type.toUpperCase();
	}

	public String getDs_type() {
		return ds_type;
	}

	@Override
	public double calculateConsumption() {
		if (this.ds_type.equals("A")) {
			return Math.floor(0.4 * (this.nr_kwH * this.nr_power));
		}
		return Math.floor(0.5 * (this.nr_kwH * this.nr_power));
	}

}
