package br.fundatec.lpi.codin.app;

import br.fundatec.lpi.codin.ConversorMorse;

public class ConversorApp {
	public static void main(String[] args) {
		ConversorMorse conv = new ConversorMorse("Abacaxi 123");
		System.out.println(conv.getMensagem());
	}

}
