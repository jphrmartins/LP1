package br.fundatec.lpi.abstracao1.app;

import br.fundatec.lpi.abstracao1.Chair;
import br.fundatec.lpi.abstracao1.Ornament;
import br.fundatec.lpi.abstracao1.Sofa;
import br.fundatec.lpi.abstracao1.Table;

public class App1 {
	public static void main(String[] args) {
		Chair chair = new Chair("23.698.365", 1000, true);
		Ornament plasticFlower = new Ornament("56.987.365", 50, "Plastic");
		Sofa sofa = new Sofa("85.321.895", 3500, 4);
		Table table = new Table("45.258.789", 500, "Square");
		
		System.out.println("Table -> Shape: " + table.getDs_shape());
		System.out.println("Sofa -> number of seats: " + sofa.getNr_seat());
		System.out.println("Chair -> " + chair.getBol_armRest());
		System.out.println("Ornament -> Material: " + plasticFlower.getDs_material());
	}
}
