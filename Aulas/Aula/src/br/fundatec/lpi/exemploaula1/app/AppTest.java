package br.fundatec.lpi.exemploaula1.app;

import br.fundatec.lpi.exemploaula1.Estacionamento;

public class AppTest {

	public static void main(String[] args) {
		
		Estacionamento estacionamentoCoberto = new Estacionamento(100, 10, 2);
		estacionamentoCoberto.setNr_carros(72);
		
		estacionamentoCoberto.abrirEstacionamento();
		System.out.println("Status: " + estacionamentoCoberto.getDs_status());
		
		System.out.println("Quantidade de vagas livres: " + estacionamentoCoberto.consultarQtdLivre());
		System.out.println("Porcentagem Livre: " + estacionamentoCoberto.calcularPorcentagemLivre() + "%");

 	}

}
