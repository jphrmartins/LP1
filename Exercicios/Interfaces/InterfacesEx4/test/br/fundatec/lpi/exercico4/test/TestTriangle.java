package br.fundatec.lpi.exercico4.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.fundatec.lpi.exercico4.Triangle;

/**
 * Classe de test para a classe de triangulo
 * @author JP, Ti11
 *
 */
public class TestTriangle {

	private Triangle triangle;
	
	@Before
	public void setUp() throws Exception {
		Triangle triangleObject = new Triangle(4, 3);
		this.triangle = triangleObject;
	}

	@Test
	public void itMustCreatTriangle() {
		Assert.assertEquals(new Double(4), new Double(this.triangle.getBase()));
		Assert.assertEquals(new Double(3), new Double(this.triangle.getSide()));
		Assert.assertEquals("Triangle", this.triangle.geometricName());
	}
	
	@Test
	public void itMustCalculateArea() {
		Double areaTriangle = this.triangle.CalculateArea();
		Assert.assertEquals(new Double(6), areaTriangle);
	}

}
