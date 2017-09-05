package br.casa2.lpi.interfaces.exercicio2.interfaces;

public interface LampInterface {

	/**
	 * Liga a lampada
	 */
	public void turnOn();

	/**
	 * Desliga a lampada
	 */
	public void turnOff();

	/**
	 * Calcula o consumo de acordo com o tipo da lampada
	 * 
	 * @return Consumo da lampada
	 */
	public double calculateConsumption();

}
