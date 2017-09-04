package br.fundatec.lpi.exercico4.interfaces;

/**
 * Interface que representa uma figura geometrica.
 * 
 * @author Jp, Ti11
 *
 */
public interface GeometricFigure {

	/**
	 * Clacula a area de uma figura geometrica.
	 * 
	 * @return Area
	 */
	public double CalculateArea();

	/**
	 * Retorna o nome da figura geometrica
	 * 
	 * @return Nome da figura geomentrica
	 */
	public String geometricName();

}
