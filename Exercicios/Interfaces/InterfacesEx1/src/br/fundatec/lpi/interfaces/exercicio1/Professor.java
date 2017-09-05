package br.fundatec.lpi.interfaces.exercicio1;

/**
 * Classe que cria professor, tem implementação de Print e se estende de pessoa
 * @author JP, Ti11
 *
 */
public class Professor extends Person implements Print {

	private double salary;

	public Professor(String ds_name, String ds_cpf, double salary) {
		super(ds_name, ds_cpf);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public void addPrintQuota(int addQuota) {
		this.nr_printQuota += addQuota + 20; 
	}

}
