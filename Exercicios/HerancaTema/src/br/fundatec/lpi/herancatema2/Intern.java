package br.fundatec.lpi.herancatema2;

/**
 * Gera um estagiario, é extendida de Worker
 * 
 * @author JP Ti11
 */
public class Intern extends Worker {

	public Intern(String nm_name, String ds_cpf, double nr_salary) {
		super(nm_name, ds_cpf, nr_salary);
	}

	@Override
	public void reAdjustSalary() {
		System.out.println("Bonus: R$100.00");
		super.reAdjustSalary();
	}

}
