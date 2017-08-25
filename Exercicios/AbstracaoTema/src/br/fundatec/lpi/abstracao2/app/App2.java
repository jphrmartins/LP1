package br.fundatec.lpi.abstracao2.app;

import br.fundatec.lpi.abstracao2.NormalPerson;
import br.fundatec.lpi.abstracao2.OldGuy;
import br.fundatec.lpi.abstracao2.Partner;
import br.fundatec.lpi.abstracao2.Studant;

public class App2 {
	public static void main(String[] args) {
		NormalPerson normal = new NormalPerson(100);
		Studant studant = new Studant(100);
		Partner partner = new Partner(100);
		OldGuy oldGuy = new OldGuy(100);

		double returnStudant = studant.modifyTicket();
		double returnOldGuy = oldGuy.modifyTicket();
		double returnPartner = partner.modifyTicket();
		double returnNormal = normal.modifyTicket();

		System.out.println("Normal total price -> 100. Discount -> R$" + returnNormal);
		System.out.println("OldGuy total price -> 100. Discount -> R$" + returnOldGuy);
		System.out.println("Partner total price -> 100. Discount -> R$" + returnPartner);
		System.out.println("Studant total price -> 100. Discount -> R$" + returnStudant);
	}
}
