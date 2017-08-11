package br.fundatec.lpi.exercicio3.app;

import br.fundatec.lpi.exercicio3.Cliente;
import br.fundatec.lpi.exercicio3.Compra;
import br.fundatec.lpi.exercicio3.Enfeite;
import br.fundatec.lpi.exercicio3.Mesa;
import br.fundatec.lpi.exercicio3.Poltrona;
import br.fundatec.lpi.exercicio3.Sofa;

public class LojaMoveis {
	public static void main(String[] args) {
		Poltrona poltrona = new Poltrona("356782", "Poltrona reclinavel massageadora", true, true);
		Enfeite enfeite = new Enfeite("250236", "flor", "plástico");
		Sofa sofa = new Sofa("657832", "Sofá", 3);
		Mesa mesa = new Mesa("32120563", "mesa ", "redonda ", enfeite);
		Cliente ragnar = new Cliente("Ragnar");
		Compra compra = new Compra("25.362-9856", ragnar);
		compra.setMesa(mesa);
		compra.setPoltrona(poltrona);
		compra.setSofa(sofa);

		System.out.println(compra.getCliente().getDs_nome() + " foi na loja de Móveis e comprou um "
				+ compra.getSofa().getDs_descricao() + " de " + compra.getSofa().getNum_lugares() + " lugares, uma "
				+ compra.getPoltrona().getDs_descricao() + " e uma " + compra.getMesa().getDs_descricao()
				+ compra.getMesa().getDs_formato() + "com uma " + compra.getMesa().getEnfeite().getDs_descricao()
				+ " de " + compra.getMesa().getEnfeite().getDs_material() + " como enfeite.");
	}
}
