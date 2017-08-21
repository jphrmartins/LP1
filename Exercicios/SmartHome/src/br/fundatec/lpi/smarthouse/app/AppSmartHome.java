package br.fundatec.lpi.smarthouse.app;

import br.fundatec.lpi.smarthouse.Dweller;
import br.fundatec.lpi.smarthouse.Ilumination;
import br.fundatec.lpi.smarthouse.Multmedia;
import br.fundatec.lpi.smarthouse.SmartHome;
import br.fundatec.lpi.smarthouse.Smartphone;

/**
 * App SmartHouse. main method
 * @author JP, Aluno da Ti11
 *
 */
public class AppSmartHome {

	public static void main(String[] args) {
		Ilumination light = new Ilumination(20);
		Multmedia homeTheater = new Multmedia("Home Theater");
		Smartphone lenovo = new Smartphone("Lenovo bive K35");
		Dweller richard = new Dweller("Richard");
		SmartHome smarthouse = new SmartHome();
		richard.setObj_smartphone(lenovo);
		smarthouse.setObj_dweller(richard);
		smarthouse.setObj_Ilumination(light);
		smarthouse.setObj_multmedia(homeTheater);
		richard.addCommitment("Open the DOM");
		smarthouse.weakingUPDwellerForCommitment();
		
		
	}

}
