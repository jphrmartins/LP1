package br.fundatec.lpi.herancatema2;

/**
 * Classe abstrata que gera funcioarios.
 * 
 * @author JP Ti11
 */
public abstract class Worker {
	protected String nm_name;
	protected String ds_cpf;
	protected double nr_salary;

	public Worker(String nm_name, String ds_cpf, double nr_salary) {
		super();
		this.nm_name = nm_name;
		this.ds_cpf = ds_cpf;
		this.nr_salary = nr_salary;
	}

	public String getNm_name() {
		return nm_name;
	}

	public String getDs_cpf() {
		return ds_cpf;
	}

	public double getNr_salary() {
		return nr_salary;
	}

	/**
	 * Reajusta o salrio dependente do emprego do funcionario
	 */
	public void reAdjustSalary() {
		System.out.println("Current Salary: " + getNr_salary());
		this.nr_salary += this.nr_salary * 0.10;
		System.out.println("New salary: " + getNr_salary());
	}

}
