package br.fundatec.lp1.ex_if_else;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite 3 números diferentes.");
		System.out.print("Entre com o primeiro número: ");
		int num_numero1 = teclado.nextInt();
		
		System.out.print("Entre com o segundo número: ");
		int num_numero2 = teclado.nextInt();
		
		System.out.print("Entre com o terceiro número: ");
		int num_numero3 = teclado.nextInt();
		
		if (num_numero1 > num_numero2 && num_numero1 > num_numero3) {
			if (num_numero2 > num_numero3) {
				System.out.println("maior: " + num_numero1 + ", menor:" + num_numero3);
			} else {
				System.out.println("maior: " + num_numero1 + ", menor:" + num_numero2);
			}
		} else if (num_numero2 > num_numero1 && num_numero2 > num_numero3) {
			if (num_numero1 > num_numero3) {
				System.out.println("maior: " + num_numero2 + ", menor:" + num_numero3);
			} else {
				System.out.println("maior: " + num_numero2 + ", menor:" + num_numero1);
			}
		} else if (num_numero3 > num_numero2 && num_numero3 > num_numero1) {
			if (num_numero1 > num_numero2) {
				System.out.println("maior: " + num_numero3 + ", menor:" + num_numero2);
			} else {
				System.out.println("maior: " + num_numero3 + ", menor:" + num_numero1);
			}
		} else {
			System.out.println("Existem número iguais");
		}
	}

}
