package br.fundatec.lpi.metodos2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestGeometricCalculator {
	private GeometricCalculator geoCalcAll;
	
	@Before
	public void setUp() throws Exception {
		GeometricCalculator geoCalc = new GeometricCalculator();
		this.geoCalcAll = geoCalc;
	}

	@Test
	public void itMustMakeAreaOfCircle() {
		this.geoCalcAll.circleArea(5);
		Assert.assertEquals(new Double(78.54), this.geoCalcAll.getArea());
	}
	
	@Test
	public void itMustMakeAreaOfQuadrilateralWithDiferentSides() {
		Assert.assertEquals("It is not a square", this.geoCalcAll.quadrilateralArea(5, 10));
		Assert.assertEquals(new Double(50), this.geoCalcAll.getArea());
	}
	
	@Test
	public void itMustMakeAreaOfQuadrilateralWithEqualSides() {
		Assert.assertEquals("It's a square", this.geoCalcAll.quadrilateralArea(5, 5));
		Assert.assertEquals(new Double(25), this.geoCalcAll.getArea());
	}
	
	@Test
	public void itMustMakeAreaOfTriangle() {
		this.geoCalcAll.triangleArea(4, 3);
		Assert.assertEquals(new Double(6), this.geoCalcAll.getArea());
	}

}
