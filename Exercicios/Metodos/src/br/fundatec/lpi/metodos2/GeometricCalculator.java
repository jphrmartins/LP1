package br.fundatec.lpi.metodos2;

public class GeometricCalculator {
	private Double area;

	public Double getArea() {
		return area;
	}

	private void setArea(Double area) {
		this.area = area;
	}

	public void circleArea(int num) {
		double area = Math.PI * Math.pow(num, 2);
		area = roundTreePlaceAfterDecimalPoint(area);
		setArea(area);
	}

	private double roundTreePlaceAfterDecimalPoint(double area) {
		area *= 1000;
		area = Math.round(area);
		area /= 1000;
		return area;
	}

	public String quadrilateralArea(double side1, double side2) {
		Double area = side1 * side2;
		setArea(area);
		return verifyEqualsSideOfQuadrilatral(side1, side2);
	}

	private String verifyEqualsSideOfQuadrilatral(double side1, double side2) {
		if (side1 == side2) {
			return "It's a square";
		}
		return "It is not a square";
	}

	public void triangleArea(double base, double height) {
		double area = (base * height) / 2;
		setArea(area);
	}

}
