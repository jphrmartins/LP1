package br.fundatec.lpi.interfaces.exercicio2.employee;

import br.fundatec.lpi.interfaces.exercicio2.interfaces.Salary;
import br.fundatec.lpi.interfaces.exercicio2.interfaces.Sector;

/**
 * Classe que cria um empregado. possui um implementação das interfaces de salario e setor.
 * @author JP, Ti11
 *
 */
public class Employee implements Salary, Sector{
	private int nr_workedHoursPerDay;
	private int vl_hour;
	private String ds_sector;
	
	public Employee(int nr_workedHoursPerDay, int vl_hour) {
		this.nr_workedHoursPerDay = nr_workedHoursPerDay;
		this.vl_hour = vl_hour;
		inputSector();
	}

	public String getDs_sector() {
		return ds_sector;
	}

	private void setDs_sector(String ds_sector) {
		this.ds_sector = ds_sector;
	}

	public int getNr_workedHoursPerDay() {
		return nr_workedHoursPerDay;
	}

	public int getVl_hour() {
		return vl_hour;
	}

	@Override
	public void changeSector() {
		if(this.ds_sector.equals("cashier") || this.ds_sector.equals("sales")) {
			this.ds_sector = "stock";
		}else {
			this.ds_sector = "sales";
		}
	}

	@Override
	public void inputSector() {
		setDs_sector("cashier");
	}

	@Override
	public int calculateSalary() {
		return (this.vl_hour * this.nr_workedHoursPerDay) * 20;
	}
	
	
	
	
}
