package br.fundatec.lpi.exericicio2.app;

import br.fundatec.lpi.exericicio2.Carro;
import br.fundatec.lpi.exericicio2.Funcionario;
import br.fundatec.lpi.exericicio2.Motorista;

public class Empresa {

	public static void main(String[] args) {

		Motorista daenerys = new Motorista("Daenerys", "365.042.258-82");
		Carro uno = new Carro("Fiat Uno", daenerys);
		uno.setNum_anoFabricacao(1960);
		Funcionario jorah = new Funcionario("Jorah");
		jorah.setCarro(uno);
		System.out.println(jorah.getCarro().getDono().getDs_nome() + " Levou seu " + jorah.getCarro().getDs_marca_modelo()
						+ ", " + jorah.getDs_nome() + " ficou responsavel por lavar seu carro.");
	}

}
