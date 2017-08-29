package br.fundatec.lpi.metodos5;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestImc {

	private IMC imcAll;

	@Before
	public void setUp() throws Exception {
		IMC imc = new IMC(73, 180);
		this.imcAll = imc;
	}

	@Test
	public void ItMustCalculateImc() {
		Double calImc = this.imcAll.calcIMC();
		Assert.assertEquals(new Double(22.53), calImc);
	}
	
	@Test	
	public void ItMustShowCategoryOfIMC() {
		String imcCategory = this.imcAll.categoryIMC();
		Assert.assertEquals("FAIXA DE PESO IDEAL", imcCategory);
	}
}
