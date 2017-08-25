package br.fundatec.lpi.herancatema3.app;

import br.fundatec.lpi.herancatema3.CheckingAccount;
import br.fundatec.lpi.herancatema3.SavingsAccount;

/**
 * Classe de teste para as contas.
 * 
 * @author JP Ti11
 */
public class App3 {

	public static void main(String[] args) {
		SavingsAccount savings = new SavingsAccount(100);
		savings.deposit(150);
		System.out.println("saving: " + savings.getNr_balance());
		savings.withdraw(45);
		System.out.println("saving: " + savings.getNr_balance());
		savings.uptadeAccount(10);

		System.out.println("------------------------------------------");
		CheckingAccount check = new CheckingAccount(100);
		check.deposit(150);
		System.out.println("check: " + check.getNr_balance());
		check.withdraw(45);
		System.out.println("check: " + check.getNr_balance());
		check.uptadeAccount(10);

		System.out.println("------------------------------------------");
		System.out.println("CheckCount: R$" + check.getNr_balance());
		System.out.println("SavingCount: R$" + savings.getNr_balance());
	}

}
