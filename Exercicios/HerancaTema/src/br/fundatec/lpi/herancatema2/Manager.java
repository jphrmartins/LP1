package br.fundatec.lpi.herancatema2;

/**
 * Classe que cria um gerente, é extendia de Worker.
 * 
 * @author JP Ti11
 */
public class Manager extends Worker {

	public Manager(String nm_name, String ds_cpf, double nr_salary) {
		super(nm_name, ds_cpf, nr_salary);
	}

	@Override
	public void reAdjustSalary() {
		System.out.println("Current Salary: " + getNr_salary());
		System.out.println("Bonus: R$" + (this.nr_salary * 0.05));
		this.nr_salary += this.nr_salary * 0.18;
		System.out.println("New salary: " + getNr_salary());

	}

}
