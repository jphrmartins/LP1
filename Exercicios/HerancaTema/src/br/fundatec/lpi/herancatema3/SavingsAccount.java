package br.fundatec.lpi.herancatema3;

/**
 * Classe que cria uma conta poupança e se extende de conta.
 * 
 * @author JP Ti11
 */
public class SavingsAccount extends Account {

	public SavingsAccount(double nr_balance) {
		super(nr_balance);
	}

	@Override
	public void withdraw(double vl_withdraw) {
		this.nr_balance -= vl_withdraw + 5;
	}

	@Override
	public void uptadeAccount(double val_percent) {
		super.uptadeAccount(val_percent * 3);
	}

}
