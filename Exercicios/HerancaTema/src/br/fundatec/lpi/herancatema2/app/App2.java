package br.fundatec.lpi.herancatema2.app;

import br.fundatec.lpi.herancatema2.Director;
import br.fundatec.lpi.herancatema2.Intern;
import br.fundatec.lpi.herancatema2.Junior;
import br.fundatec.lpi.herancatema2.Manager;

/**
 * Classe que testa o sistema de salarios de uma empresa.
 * 
 * @author JP Ti11
 */
public class App2 {
	public static void main(String[] args) {
		Intern nath = new Intern("Nath", "021.365.987-03", 856);
		Manager manager = new Manager("Bruna", "235.698.745-27", 3500);
		Junior junior = new Junior("Adolfo", "456.123.789-56", 1200);
		Director director = new Director("Rodrigo", "856.214.793-23", 12000);
		System.out.println(nath.getNm_name());
		nath.reAdjustSalary();
		System.out.println(manager.getNm_name());
		manager.reAdjustSalary();
		System.out.println(junior.getNm_name());
		junior.reAdjustSalary();
		System.out.println(director.getNm_name());
		director.reAdjustSalary();
	}

}
