package br.fundatec.lpi.exercico4;

import br.fundatec.lpi.exercico4.interfaces.GeometricFigure;

/**
 * Classe que cria um circulo. Tem a implementação de Figura geometrica
 * 
 * @author Jp, Ti11
 *
 */
public class Circle implements GeometricFigure {
	private Double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	@Override
	public double CalculateArea() {
		Double area = Math.pow(this.radius, 2) * Math.PI;
		area = roundValue(area);
		return area;
	}

	/**
	 * Arredonda valor com 3 casas depois da virgula
	 * 
	 * @param value
	 *            Valor para ser arredondado
	 * @return Valor arredondado
	 */
	private Double roundValue(Double value) {
		value *= 1000;
		value = Math.floor(value);
		value /= 1000;
		return value;
	}

	@Override
	public String geometricName() {
		return "Circle";
	}

}
