package br.fundatec.lp1.ex_if_else;

import java.util.Scanner;

public class Exercicio {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Insira a nota do aluno: ");
		int num_nota = teclado.nextInt();
		
		if (num_nota >= 7) {
			System.out.println("Aluno aprovado");
		} else if (num_nota >=3 && num_nota < 7) {
			System.out.println("Aluno em Recuperação");
		} else {
			System.out.println("Aluno Reprovado");
		}
	}

}
