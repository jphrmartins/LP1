package br.fundatec.lpi.exercico4.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.fundatec.lpi.exercico4.Quadrilateral;

/**
 * Classe de teste para um Quadrilatero
 * @author Jp, Ti11
 *
 */
public class TestQuadrilateral {
	private Quadrilateral square;
	private Quadrilateral rectangle;
	
	@Before
	public void setUp() throws Exception {
		Quadrilateral squareObject = new Quadrilateral(5, 5);
		this.square = squareObject;
		Quadrilateral rectangleObject = new Quadrilateral(10, 5);
		this.rectangle = rectangleObject;
	}

	@Test
	public void itMustsCreateSquare() {
		Assert.assertEquals(5, this.square.getSideA());
		Assert.assertEquals(5, this.square.getSideB());
		Assert.assertEquals("Square", this.square.geometricName());
	}
	
	@Test
	public void itMustsCreateRectangle() {
		Assert.assertEquals(10, this.rectangle.getSideA());
		Assert.assertEquals(5, this.rectangle.getSideB());
		Assert.assertEquals("Rectangle", this.rectangle.geometricName());
	}
	
	@Test
	public void itMustCalculateAreaOfSquare() {
		Assert.assertEquals(new Double(25), new Double (this.square.CalculateArea()));
	}
	
	@Test
	public void itMustCalculateAreaOfRectangle() {
		Assert.assertEquals(new Double(50), new Double (this.rectangle.CalculateArea()));
	}
	

}
