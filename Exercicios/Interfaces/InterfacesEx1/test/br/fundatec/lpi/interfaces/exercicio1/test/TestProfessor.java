package br.fundatec.lpi.interfaces.exercicio1.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.fundatec.lpi.interfaces.exercicio1.Professor;

/**
 * Classe que testa a criação da classe professor que possui a implementação de Print
 * @author JP, Ti11
 *
 */
public class TestProfessor {
	private Professor profAll;

	@Before
	public void setUp() throws Exception {
		Professor everton = new Professor("Everton", "36525869874", 12000);
		profAll = everton;
	}

	@Test
	public void itMustCreatProfessor() {
		Assert.assertEquals("Everton", this.profAll.getDs_name());
		Assert.assertEquals("36525869874", this.profAll.getDs_cpf());
		Assert.assertEquals(new Double(12000), new Double(this.profAll.getSalary()));
		Assert.assertEquals(10, this.profAll.getNr_printQuota());
	}
	@Test
	public void itMustAddPrintQuotaForProfessor() {
		this.profAll.addPrintQuota(5);
		Assert.assertEquals(35, this.profAll.getNr_printQuota());
	}

}
