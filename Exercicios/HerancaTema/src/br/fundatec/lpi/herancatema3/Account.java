package br.fundatec.lpi.herancatema3;

/**
 * Classe abstrata que cria uma conta, é extendida para outras classes.
 * 
 * @author JP Ti11
 */
public abstract class Account {
	protected double nr_balance;

	public Account(double nr_balance) {
		this.nr_balance = nr_balance;
	}

	public double getNr_balance() {
		return nr_balance;
	}

	public void deposit(double vl_deposit) {
		this.nr_balance += vl_deposit;
	}

	public void withdraw(double vl_withdraw) {
		this.nr_balance -= vl_withdraw;
	}

	/**
	 * Atualiza o saldo com o valor de percentual passado.
	 * 
	 * @param val_percent
	 *            Valor do percentual
	 */
	public void uptadeAccount(double val_percent) {
		val_percent = val_percent / 100;
		this.nr_balance += this.nr_balance * val_percent;
		System.out.println("Current balance: " + getNr_balance());
	}
}
