package br.casa2.lpi.interfaces.exercicio2.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.casa2.lpi.interfaces.exercicio2.LedLamp;

/**
 * Classe de Teste para a classe da lampada Led.
 * @author JP, Ti11
 *
 */
public class TestLedLamp {
	private LedLamp led;
	
	@Before
	public void setUp() throws Exception {
		LedLamp ledObject = new LedLamp(20, 5, "a");
		this.led = ledObject;
	}

	@Test
	public void itMustCreateLedLamp() {
		Assert.assertEquals(20, this.led.getNr_kwH());
		Assert.assertEquals(5, this.led.getNr_power());
		Assert.assertEquals("OFF", this.led.getDs_status());
		Assert.assertEquals("A", this.led.getDs_type());
	}
	
	@Test
	public void itMustTurnOnLedLamp() {
		this.led.turnOn();
		Assert.assertEquals("ON", this.led.getDs_status());
	}
	
	@Test
	public void itMustCalculateConsumptionTypeA() {
		Double consumption = this.led.calculateConsumption();
		Assert.assertEquals(new Double(40), consumption);
	}
	
	@Test
	public void itMustCalculateConsumptionTypeB() {
		LedLamp ledTypeB = new LedLamp(20, 5, "b");
		Double consumption = ledTypeB.calculateConsumption();
		Assert.assertEquals(new Double(50), consumption);
	}

}
