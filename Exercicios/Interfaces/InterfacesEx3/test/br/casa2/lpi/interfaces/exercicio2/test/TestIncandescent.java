package br.casa2.lpi.interfaces.exercicio2.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.casa2.lpi.interfaces.exercicio2.IncandescenteLamp;

/**
 * Classe de teste para a classe de lampada Incandescente.
 * @author JP, Ti11
 *
 */
public class TestIncandescent {
	private IncandescenteLamp Incandescent;

	@Before
	public void setUp() throws Exception {
	IncandescenteLamp lamp = new IncandescenteLamp(20, 7);
	this.Incandescent = lamp;
	}

	@Test
	public void itMustCreateIncadescenteLamp() {
		Assert.assertEquals(20, this.Incandescent.getNr_kwH());
		Assert.assertEquals(7, this.Incandescent.getNr_power());
		Assert.assertEquals("OFF", this.Incandescent.getDs_status());
	}
	
	@Test
	public void itMustTurnOnIncadescenteLamp() {
		this.Incandescent.turnOn();
		Assert.assertEquals("ON", this.Incandescent.getDs_status());
	}
	
	@Test
	public void itMustCalculateConsumption() {
		Double consumption = this.Incandescent.calculateConsumption();
		Assert.assertEquals(new Double(140), consumption);
	}

}
