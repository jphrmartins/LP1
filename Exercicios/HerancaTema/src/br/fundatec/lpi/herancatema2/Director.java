package br.fundatec.lpi.herancatema2;

/**
 * Classe que gera um diretor, esta classe é extendida da classe Worker.
 * 
 * @author JP Ti11
 */
public class Director extends Worker {

	public Director(String nm_name, String ds_cpf, double nr_salary) {
		super(nm_name, ds_cpf, nr_salary);
	}

	@Override
	public void reAdjustSalary() {
		System.out.println("Current Salary: " + getNr_salary());
		this.nr_salary += this.nr_salary * 0.20;
		System.out.println("Bonus: R$1000.00");
		System.out.println("New salary: " + getNr_salary());

	}

}
