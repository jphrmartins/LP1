package br.fundatec.lpi.metodos5;

public class IMC {
	// ATRIBUTOS
	private int weight;
	private double height;

	// CONSTRUTOR
	public IMC(int weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	// GETTERS SETTERS
	public int getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	// METODOS
	public Double calcIMC() {
		changeWeightIfOver100();
		double imc = this.weight / (Math.pow(this.height, 2));
		imc = roundIMC(imc);
		return imc;
	}

	public String categoryIMC() {
		Double imc = this.calcIMC();
		if (imc < 15) {
			return "EXTREMAMENTE ABAIXO DO PESO";
		} else if (imc >= 15 && imc < 16) {
			return "GRAVEMENTE ABAIXO DO PESO";
		} else if (imc >= 16 && imc < 18.5) {
			return "ABAIXO DO PESO IDEAL";
		} else if (imc >= 18.5 && imc < 25) {
			return "FAIXA DE PESO IDEAL";
		} else if (imc >= 25 && imc < 30) {
			return "SOBREPESO";
		} else if (imc >= 30 && imc < 35) {
			return "OBESIDADE GRAU I";
		} else if (imc >= 35 && imc <= 40) {
			return "OBESIDADE GRAU II (GRAVE)";
		}
		return "OBESIDADE GRAU III (MÓRBIDA)";
	}

	// METODOS AUXILIARES
	private double roundIMC(double imc) {
		imc *= 100;
		imc = Math.round(imc);
		imc /= 100;
		return imc;
	}

	private void changeWeightIfOver100() {
		if (this.height > 100) {
			this.height /= 100;
		}
	}

}
