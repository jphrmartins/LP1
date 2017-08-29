package br.fundatec.lpi.metodos3;

public class ConvTemprature {

	public Double convertToFarenheit(double celcius) {
		double farenheit = ((9 * celcius) / 5) + 32;
		farenheit = roundValue(farenheit);
		return farenheit;
	}

	public Double convertToCelcius(double farenheit) {
		double celcius = (5 * (farenheit - 32))/9;
		celcius = roundValue(celcius);
		return celcius;
	}

	private double roundValue(double value) {
		return Math.round(value);
	}


}
