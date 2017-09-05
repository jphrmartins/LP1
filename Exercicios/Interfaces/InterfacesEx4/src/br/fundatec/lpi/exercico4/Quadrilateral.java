package br.fundatec.lpi.exercico4;

import br.fundatec.lpi.exercico4.interfaces.GeometricFigure;

/**
 * Classe que cria um quadrilatero
 * 
 * @author Jp, Ti11
 *
 */
public class Quadrilateral implements GeometricFigure {
	private int sideA;
	private int sideB;

	public Quadrilateral(int sideA, int sideB) {
		this.sideA = sideA;
		this.sideB = sideB;
	}

	public int getSideA() {
		return sideA;
	}

	public int getSideB() {
		return sideB;
	}

	@Override
	public double CalculateArea() {
		double area = this.sideA * this.sideB;
		return area;
	}

	@Override
	public String geometricName() {
		if (this.sideA == this.sideB) {
			return "Square";
		}
		return "Rectangle";
	}

}
