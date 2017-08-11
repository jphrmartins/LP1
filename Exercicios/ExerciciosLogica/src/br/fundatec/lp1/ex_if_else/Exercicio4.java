package br.fundatec.lp1.ex_if_else;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Entre com um número: ");
		int num_numero1 = teclado.nextInt();

		if (num_numero1 % 2 == 0) {
			System.out.println(num_numero1 + ", é um número par");
		} else {
			System.out.println(num_numero1 + ", é um número ímpar");
		}
	}

}
