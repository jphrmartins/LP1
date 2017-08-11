package br.fundatec.lpi.execoesii;

public class VetorNumerico {

	private int nr_valor;
	private int[] vetorNumero;

	public VetorNumerico(int nr_valor) {
		super();
		this.nr_valor = nr_valor;
		this.vetorNumero = new int[50];
		popularVetor();
	}

	public int getNr_valor() {
		return nr_valor;
	}

	public void getVetorNumero() {
		try {
			for(int loop = 0; loop <= 70; loop++){
				System.out.println(this.vetorNumero[loop]);
			}
		} catch (Exception e) {
			System.out.println("Fora dos limites do array");
			System.out.println(e);
		}
	}

	private void popularVetor() {
		for (int loop = 0; loop < vetorNumero.length; loop++) {
			this.vetorNumero[loop] = this.nr_valor * loop;
		}
	}

}
