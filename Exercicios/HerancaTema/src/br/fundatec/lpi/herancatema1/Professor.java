package br.fundatec.lpi.herancatema1;

public class Professor extends Person {
	protected int hr_work;
	protected String ds_schooling;

	public Professor(String nm_name, String ds_cpf, int nr_printQuota, int hr_work) {
		super(nm_name, ds_cpf, nr_printQuota);
		this.hr_work = hr_work;
	}

	public int getHr_work() {
		return hr_work;
	}

	public String getDs_schooling() {
		return ds_schooling;
	}

	public void setDs_schooling(String ds_schooling) {
		this.ds_schooling = ds_schooling;
	}

	@Override
	public void extendQuotaPrint(int nr_valueExtend) {
		System.out.println("value of icrease: " + nr_valueExtend);
		this.nr_printQuota += nr_valueExtend + 30;
		System.out.println("Current value of Quota: " + getNr_printQuota());
	}

}
