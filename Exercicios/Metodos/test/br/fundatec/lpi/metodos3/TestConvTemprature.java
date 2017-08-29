package br.fundatec.lpi.metodos3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestConvTemprature {
	private ConvTemprature conv;	
	@Before
	public void setUp() throws Exception {
		ConvTemprature convObject = new ConvTemprature();
		this.conv = convObject;
	}

	@Test
	public void itMustConvertCelciusToFarenheit() {
		Double convToFarenheit = this.conv.convertToFarenheit(17);
		Assert.assertEquals(new Double(63), convToFarenheit);
	}
	
	@Test
	
	public void itMustConvertFarenheitToCelcius() {
		Assert.assertEquals(new Double(17), this.conv.convertToCelcius(63));
	}

}
