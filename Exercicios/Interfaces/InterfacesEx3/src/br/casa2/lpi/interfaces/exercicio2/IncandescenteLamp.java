package br.casa2.lpi.interfaces.exercicio2;

/**
 * Classe que cria uma lampada incandescente, possui a superclasse Lamp.
 * @author JP, Ti11
 *
 */
public class IncandescenteLamp extends Lamp {

	public IncandescenteLamp(int kwH, int power) {
		super(kwH, power);
	}

	@Override
	public double calculateConsumption() {
		return Math.floor(this.nr_kwH * this.nr_power);
	}

}
