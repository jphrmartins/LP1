package br.casa2.lpi.interfaces.exercicio2;

import br.casa2.lpi.interfaces.exercicio2.interfaces.LampInterface;

/**
 * Classe abstrata que que possui a interface de Lampada
 * @author JP
 *
 */
public abstract class Lamp implements LampInterface {
	protected int nr_power;
	protected int nr_kwH;
	protected String ds_status;

	public Lamp(int kwH, int power) {
		this.nr_kwH = kwH;
		this.nr_power = power;
		turnOff();
	}

	public int getNr_power() {
		return nr_power;
	}

	public String getDs_status() {
		return ds_status;
	}

	public int getNr_kwH() {
		return nr_kwH;
	}
	
	@Override
	public void turnOn() {
		this.ds_status = "ON";
	}

	@Override
	public void turnOff() {
		this.ds_status = "OFF";
	}

	@Override
	public abstract double calculateConsumption();

}
