package br.fundatec.lpi.herancatema1;

/**
 * Classe abstrata que gera uma pessoa no cenario de uma escola.
 * 
 * @author JP Ti11
 *
 */
public abstract class Person {
	protected String nm_name;
	protected String ds_cpf;
	protected int nr_printQuota;

	public Person(String nm_name, String ds_cpf, int nr_printQuota) {
		super();
		this.nm_name = nm_name;
		this.ds_cpf = ds_cpf;
		this.nr_printQuota = nr_printQuota;
	}

	public String getNm_name() {
		return nm_name;
	}

	public String getDs_cpf() {
		return ds_cpf;
	}

	public int getNr_printQuota() {
		return nr_printQuota;
	}

	/**
	 * metodo que aumente a cota de impressoes de pessoa, dependendo de seu cargo.
	 * 
	 * @param nr_valueExtend
	 *            valor a ser aumentado
	 */
	public void extendQuotaPrint(int nr_valueExtend) {
		System.out.println("value of icrease: " + nr_valueExtend);
		this.nr_printQuota += nr_valueExtend;
		System.out.println("Current value " + getNr_printQuota());
	}

}
