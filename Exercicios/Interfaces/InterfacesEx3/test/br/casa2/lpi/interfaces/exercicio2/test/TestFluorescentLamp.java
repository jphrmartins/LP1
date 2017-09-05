package br.casa2.lpi.interfaces.exercicio2.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.casa2.lpi.interfaces.exercicio2.FluorescentLamp;

/**
 * Classe de teste para a classe de lampada fluorescente, que possui uma
 * implementação de lampada.
 * 
 * @author JP, Ti11
 *
 */
public class TestFluorescentLamp {
	private FluorescentLamp lampAll;

	@Before
	public void setUp() throws Exception {
		FluorescentLamp fluoObject = new FluorescentLamp(20, 9);
		lampAll = fluoObject;
	}

	@Test
	public void itMustCreateFluorescentLamp() {
		Assert.assertEquals(20, this.lampAll.getNr_kwH());
		Assert.assertEquals(9, this.lampAll.getNr_power());
		Assert.assertEquals("OFF", this.lampAll.getDs_status());
	}

	@Test
	public void itMustTurnOnFluorescentLamp() {
		this.lampAll.turnOn();
		Assert.assertEquals("ON", this.lampAll.getDs_status());
	}

	@Test
	public void itMustCalculateConsumptionFluorescentLamp() {
		Double consumption = this.lampAll.calculateConsumption();
		Assert.assertEquals(new Double(125), consumption);
	}

}
