package br.fundatec.lpi.exercico4.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.fundatec.lpi.exercico4.Circle;

/**
 * Classe de teste para Circulo
 * 
 * @author Jp, Ti11
 *
 */
public class TestCircle {
	private Circle circle;

	@Before
	public void setUp() throws Exception {
		Circle circleObject = new Circle(5);
		this.circle = circleObject;
	}

	@Test
	public void itMustCreatCircle() {
		Assert.assertEquals(new Double(5), this.circle.getRadius());
		Assert.assertEquals("Circle", this.circle.geometricName());
	}

	@Test
	public void itMustCalculateArea() {
		Assert.assertEquals(new Double(78.539), new Double(this.circle.CalculateArea()));
	}

}
