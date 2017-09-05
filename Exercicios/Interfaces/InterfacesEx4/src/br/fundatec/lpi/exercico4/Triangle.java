package br.fundatec.lpi.exercico4;

import br.fundatec.lpi.exercico4.interfaces.GeometricFigure;

/**
 * Classe que cria um triangulo, possui a implementação da interface Figura Geometrica
 * @author JP, Ti11
 *
 */
public class Triangle implements GeometricFigure {
	private double base;
	private double side;
	
	public Triangle(double base, double side) {
		super();
		this.base = base;
		this.side = side;
	}

	public double getBase() {
		return base;
	}

	public double getSide() {
		return side;
	}

	@Override
	public double CalculateArea() {
		return (this.base * this.side) /2;
	}

	@Override
	public String geometricName() {
		return "Triangle";
	}

}
