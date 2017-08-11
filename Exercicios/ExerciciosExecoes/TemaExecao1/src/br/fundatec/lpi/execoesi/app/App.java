package br.fundatec.lpi.execoesi.app;

import br.fundatec.lpi.execoesi.Crediario;

public class App {
	public static void main(String[] args) {
		Crediario cred = new Crediario(500, 25);
		System.out.println("Valor total: R$" + cred.getNr_valorTotal());
		System.out.println("Quantidade de parcelas: " + cred.getNr_numParcelas());
		System.out.println("Valor de cada parcela: R$" + cred.gerarParcelas());
	}

}
