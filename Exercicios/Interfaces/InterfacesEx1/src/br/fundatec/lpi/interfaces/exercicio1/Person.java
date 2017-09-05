package br.fundatec.lpi.interfaces.exercicio1;

/**
 * Classe abstrada que idetifica uma pessoa.
 * SuperClasse de Studant e Professor.
 * @author JP
 *
 */
public abstract class Person {
	protected String ds_name;
	protected String ds_cpf;
	protected int nr_printQuota;

	public Person(String ds_name, String ds_cpf) {
		this.ds_name = ds_name;
		this.ds_cpf = ds_cpf;
		this.nr_printQuota = 10;
	}

	public String getDs_name() {
		return ds_name;
	}

	public String getDs_cpf() {
		return ds_cpf;
	}

	public int getNr_printQuota() {
		return nr_printQuota;
	}

}
