package br.fundatec.lpi.execoes.app;

import br.fundatec.lpi.execoes.Conta;

public class App {
	public static void main(String[] args) {
		Conta conta = new Conta(700, 200);
		conta.depositar(100);
		if(!conta.sacar(1100)){
			System.out.println("Saldo Insuficiente");
		} else {
			System.out.println("Saque efetuado");
		}
		
	}

}
