package br.fundatec.lpi.interfaces.exercicio2.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.fundatec.lpi.interfaces.exercicio2.employee.Employee;

/**
 * Classe que testa a implementação das interfaces setor e salario na classe empregado
 * @author JP, TI11
 *
 */
public class TestEmployee {
	private Employee emploAll;

	@Before
	public void setUp() throws Exception {
		Employee emplo = new Employee(8, 30);
		this.emploAll = emplo;
	}

	@Test
	public void itMustCreateEmployee() {
		Assert.assertEquals(8, this.emploAll.getNr_workedHoursPerDay());
		Assert.assertEquals(30, this.emploAll.getVl_hour());
		Assert.assertEquals("cashier", this.emploAll.getDs_sector());
	}
	
	@Test
	public void itMustChangeSector() {
		this.emploAll.changeSector();
		Assert.assertEquals("stock", this.emploAll.getDs_sector());
	}
	
	@Test
	public void itMustCalculateSalary() {
		double salary = this.emploAll.calculateSalary();
		Assert.assertEquals(new Double(4800), new Double(salary));
	}

}
