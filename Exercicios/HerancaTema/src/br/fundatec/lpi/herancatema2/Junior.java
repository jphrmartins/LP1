package br.fundatec.lpi.herancatema2;

/**
 * Classe que gera um junior, é extendida da classe Worker.
 * 
 * @author JP Ti11
 */
public class Junior extends Worker {

	public Junior(String nm_name, String ds_cpf, double nr_salary) {
		super(nm_name, ds_cpf, nr_salary);
	}

	@Override
	public void reAdjustSalary() {
		System.out.println("Current Salary: " + getNr_salary());
		this.nr_salary += this.nr_salary * 0.15;
		System.out.println("New salary: " + getNr_salary());
	}

}
