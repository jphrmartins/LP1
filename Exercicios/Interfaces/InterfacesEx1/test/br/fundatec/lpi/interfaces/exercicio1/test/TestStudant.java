package br.fundatec.lpi.interfaces.exercicio1.test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.fundatec.lpi.interfaces.exercicio1.Student;


/**
 * Classe que Testa a implementação de Print na classe Estudante.
 * @author JP
 *
 */
public class TestStudant {
	private Student alunoAll;

	@Before
	public void setUp() throws Exception {
		Student studant = new Student("JP", "85600539053");
		this.alunoAll = studant;
	}

	@Test
	public void itMustCreateStudant() {
		Assert.assertEquals("JP", this.alunoAll.getDs_name());
		Assert.assertEquals("85600539053", this.alunoAll.getDs_cpf());
		Assert.assertEquals(10, this.alunoAll.getNr_printQuota());
	}
	
	@Test
	public void itMustAddPrintQuota() {
		this.alunoAll.addPrintQuota(5);
		Assert.assertEquals(25, this.alunoAll.getNr_printQuota());

	}


}
