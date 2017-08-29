package br.fundatec.lpi.metodos4;

public class Employee {
	private String ds_name;
	private int nr_sector;
	private String ds_role;

	public Employee(String ds_name, int nr_sector) {
		this.nr_sector = nr_sector;
		this.ds_name = ds_name;
	}

	public String getDs_role() {
		return ds_role;
	}

	public void setDs_role(String ds_role) {
		this.ds_role = ds_role;
	}

	public String getDs_name() {
		return ds_name;
	}

	public int getNr_sector() {
		return nr_sector;
	}

	public double calculateSalary(int hourWeek) {
		if (this.nr_sector == 3) {
			return 58 * hourWeek * 4.5;
		} else if (this.nr_sector == 2) {
			return 42 * hourWeek * 4.5;
		} else if (this.nr_sector == 1) {
			return 30 * hourWeek * 4.5;
		} else {
			throw new RuntimeException("Invalidy sector");
		}

	}

}
