package br.fundatec.lpi.execoesi.app;


import br.fundatec.lpi.execoesi.Crediario;

public class App {
	public static void main(String[] args) {
		Crediario cred = new Crediario(500, 25);
		System.out.println(cred);
	}

}
