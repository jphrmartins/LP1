package br.fundatec.lpi.metodos1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void itMustSumValues() {
		Assert.assertEquals(7, Calculator.sum(2, 5));
	}

	@Test
	public void itMustSumEqualsValues() {
		Assert.assertEquals(4, Calculator.sum(2, 2));
	}

	@Test
	public void itMustSubValues() {
		Assert.assertEquals(4, Calculator.sub(6, 2));
	}

	@Test
	public void itMustSubEqualsValues() {
		Assert.assertEquals(0, Calculator.sub(6, 6));
	}

	@Test
	public void itMustMultValues() {
		Assert.assertEquals(6, Calculator.mult(2, 3));
	}

	@Test
	public void itMustMultEqualsValues() {
		Assert.assertEquals(4, Calculator.mult(2, 2));
	}

	@Test
	public void itMustDivideEqualsValues() {
		Assert.assertEquals(1, Calculator.divide(2, 2));
	}

	@Test
	public void itMustDivideValues() {
		Assert.assertEquals(3, Calculator.divide(6, 2));
	}
	
	@Test
	public void itMustDivideValuesByZero() {
		Assert.assertEquals(0, Calculator.divide(2, 0));
	}
	
	@Test
	public void itMustSquareRootOfValue() {
		Assert.assertEquals(new Double(5), new Double(Calculator.squareRoot(25)));
	}
	
	@Test 
	public void itMustCubicRootOfValue() {
		Assert.assertEquals(new Double(5), new Double(Calculator.cubicRoot(125)));
	}
	
	@Test
	public void itMustVerifyOddNumber() {
		Assert.assertEquals("25 It's Odd", Calculator.verifyPairOrOdd(25));
	}
	
	@Test 
	public void itMustVerifyPairNumber() {
		Assert.assertEquals("8 It's Pair", Calculator.verifyPairOrOdd(8));
	}
	
	@Test
	public void itMustMakeFactorialOfNumber() {
		Assert.assertEquals(120, Calculator.factorial(5));
	}

}
