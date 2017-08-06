package br.fundatec.lpi.exercicio3;

import javax.management.RuntimeErrorException;

public class Sofa extends Movel {
	private int num_lugares;
	
	public Sofa(String ds_codigo, String ds_descricao, int num_lugares) {
		super(ds_codigo, ds_descricao);
		this.num_lugares = num_lugares;
		validarLugares();
	}

	private void validarLugares() {
		if(lugaresIgualZeroOuMenor()) {
			throw new RuntimeException("Numero de lugares do sofa invalido");
		}
	}

	private boolean lugaresIgualZeroOuMenor() {
		return this.num_lugares <= 0;
	}

	public int getNum_lugares() {
		return num_lugares;
	}

}
