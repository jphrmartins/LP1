package br.fundatec.lpi.interfaces.exercicio1;

/**
 * Classe que cria um estudante possui a herança de Pessoa e a implementação de Print.
 * @author JP
 *
 */
public class Student extends Person implements Print{

	public Student(String ds_name, String ds_cpf) {
		super(ds_name, ds_cpf);
	}

	@Override
	public void addPrintQuota(int addQuota) {
		this.nr_printQuota += addQuota + 10;
	}

}
