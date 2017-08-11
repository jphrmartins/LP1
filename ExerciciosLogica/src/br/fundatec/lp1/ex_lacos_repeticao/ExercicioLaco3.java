package br.fundatec.lp1.ex_lacos_repeticao;

public class ExercicioLaco3 {

	public static void main(String[] args) {

		double num_populacaoCidadeA = 8000;
		double num_populacaoCidadeB = 10000;
		int contador = 0;

		while (num_populacaoCidadeA <= num_populacaoCidadeB) {
			num_populacaoCidadeA = num_populacaoCidadeA + (num_populacaoCidadeA * 0.03);
			num_populacaoCidadeB = num_populacaoCidadeB + (num_populacaoCidadeB * 0.015);
			contador++;
		}
		System.out.println("Demorou " + contador + " anos pra cidade A possuir mais habitantes que a cidade B.");
	}

}
