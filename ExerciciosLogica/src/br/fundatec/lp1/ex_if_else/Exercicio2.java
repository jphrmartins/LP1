package br.fundatec.lp1.ex_if_else;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("entre com o primeiro número: ");
		int num_numero1 = teclado.nextInt();

		System.out.print("entre com o segundo número: ");
		int num_numero2 = teclado.nextInt();

		if (num_numero1 > num_numero2) {
			System.out.println("o numero " + num_numero1 + ", é maior doque o " + "número " + num_numero2);
		} else if(num_numero2 > num_numero1) {
			System.out.println("o numero " + num_numero2 + ", é maior doque o " + "número " + num_numero1);
		} else {
			System.out.println("o numero " + num_numero1 + ", é igual ao " + "número " + num_numero2);
		}
	}
}
