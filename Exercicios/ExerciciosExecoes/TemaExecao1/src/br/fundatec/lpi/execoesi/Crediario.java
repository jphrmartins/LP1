package br.fundatec.lpi.execoesi;


public class Crediario {
	private double nr_valorTotal;
	private double nr_numParcelas;

	public Crediario(double nr_valorTotal, double nr_numParcelas) {
		super();
		this.nr_valorTotal = nr_valorTotal;
		this.nr_numParcelas = nr_numParcelas;
		gerarParcelas();
	}

	public double getNr_valorTotal() {
		return nr_valorTotal;
	}

	public double getNr_numParcelas() {
		return nr_numParcelas;
	}

	private void gerarParcelas() {
		if(this.nr_numParcelas > 0) {
			try {
				double nr_valorParcelas = this.nr_valorTotal/this.nr_numParcelas;
				System.out.println(nr_valorParcelas);
			} catch (Exception e) {
				System.out.println("Divisão por 0");
			}
		}
		
	}
}
