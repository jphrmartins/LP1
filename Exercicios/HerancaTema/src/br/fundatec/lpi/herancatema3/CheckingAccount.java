package br.fundatec.lpi.herancatema3;

/**
 * Classe que cria uma conta corrente e se extende de conta.
 * 
 * @author JP Ti11
 */
public class CheckingAccount extends Account {

	public CheckingAccount(double nr_balance) {
		super(nr_balance);
	}

	@Override
	public void uptadeAccount(double val_percent) {
		super.uptadeAccount(val_percent * 2);
	}

}
