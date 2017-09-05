package br.casa2.lpi.interfaces.exercicio2;


/**
 * Classe que cria uma lampada fluorecente. É uma extensao da classe Lampada
 * 
 * @author JP, Ti11
 *
 */
public class FluorescentLamp extends Lamp {
	public FluorescentLamp(int kwH, int power) {
		super(kwH, power);
	}


	@Override
	public double calculateConsumption() {
		return Math.floor(0.7 * (this.nr_kwH * this.nr_power));
	}

}
