package br.fundatec.lpi.herancatema1;

public class Student extends Person {
	protected int nr_subjects;
	protected boolean bol_lateMensality;

	public Student(String nm_name, String ds_cpf, int nr_printQuota, int nr_subjects, boolean bol_lateMensality) {
		super(nm_name, ds_cpf, nr_printQuota);
		this.nr_subjects = nr_subjects;
		this.bol_lateMensality = bol_lateMensality;
	}

	public int getNr_subjects() {
		return nr_subjects;
	}

	private boolean isBol_lateMensality() {
		return bol_lateMensality;
	}

	/**
	 * Metodo que gera uma mensagem depedendo de um atributo boolean.
	 */
	public void lateMensality() {
		if (isBol_lateMensality()) {
			System.out.println("Student with late mensality");
		}
		System.out.println("Student ok with mensality");
	}

	@Override
	public void extendQuotaPrint(int nr_valueExtend) {
		if (!isBol_lateMensality()) {
			lateMensality();
			System.out.println("value of icrease: " + nr_valueExtend);
			this.nr_printQuota += nr_valueExtend + 10;
			System.out.println("Current value of Quota: " + getNr_printQuota());
		}
	}

}
