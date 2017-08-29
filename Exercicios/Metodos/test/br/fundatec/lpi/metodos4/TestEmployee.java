package br.fundatec.lpi.metodos4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEmployee {
	private Employee employeeSector1;
	private Employee employeeSector2;
	private Employee employeeSector3;
	
	@Before
	public void setUp() throws Exception {
		Employee emplo1 = new Employee("Roger", 1);
		this.employeeSector1 = emplo1;
		Employee emplo2 = new Employee("Briggs", 2);
		this.employeeSector2 = emplo2;
		Employee emplo3 = new Employee("Guilherme", 3);
		this.employeeSector3 = emplo3;
	}
	
	@Test
	public void itMustCreateEmployee() {
		this.employeeSector1.setDs_role("Astro Explorer");
		Assert.assertEquals("Roger", this.employeeSector1.getDs_name());
		Assert.assertEquals(1, this.employeeSector1.getNr_sector());
		Assert.assertEquals("Astro Explorer", this.employeeSector1.getDs_role());
	}

	@Test
	public void itMustCalculateSalaryEmployeeSector1() {
		double salarySector1 = this.employeeSector1.calculateSalary(40);
		Assert.assertEquals(new Double(5400), new Double(salarySector1));
	}
	
	@Test
	public void itMustCalculateSalaryEmployeeSector2() {
		double salarySector2 = this.employeeSector2.calculateSalary(40);
		Assert.assertEquals(new Double(7560), new Double(salarySector2));
	}
	
	@Test
	public void itMustCalculateSalaryEmployeeSector3() {
		double salarySector3 = this.employeeSector3.calculateSalary(40);
		Assert.assertEquals(new Double(10440), new Double(salarySector3));
	}
	
	@Test (expected = RuntimeException.class)
	public void itMustReturnErrorInvalidSector() {
		Employee employeeInvalidSector = new Employee("Inv Sector", 4);
		employeeInvalidSector.calculateSalary(40);
	}
	
}
