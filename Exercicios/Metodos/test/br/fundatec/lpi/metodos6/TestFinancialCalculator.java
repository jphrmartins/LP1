package br.fundatec.lpi.metodos6;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestFinancialCalculator {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void itMustConvBRLToUSD() {
		Double realToDollar = FinancialCalculator.conv("BRL", 100.00, "USD");
		Assert.assertEquals(new Double(31), realToDollar);
	}
	@Test
	public void itMustConvBRLToEUR() {
		Double realToEuro = FinancialCalculator.conv("BRL", 100.00, "EUR");
		Assert.assertEquals(new Double(26), realToEuro);
	}
	@Test
	public void itMustConvBRLToGBP() {
		Assert.assertEquals(new Double(24), new Double(FinancialCalculator.conv("BRL", 100, "GBP")));
	}
}
