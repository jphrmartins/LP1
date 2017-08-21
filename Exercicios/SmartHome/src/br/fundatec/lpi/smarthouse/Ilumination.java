package br.fundatec.lpi.smarthouse;

/**
 * Classe que se estende da classe "Eletronic". Representa o sistema de luzes da
 * casa.
 * 
 * @author JP, Aluno Ti11
 *
 */
public class Ilumination extends Eletronic {
	private int nr_lights;

	/**
	 * Cria um objeto desta classe, inicializa o numero de luzes por um valor
	 * previamente passado.
	 * 
	 * @param nr_lights
	 *            Valor de luzes previamente passado.
	 */
	public Ilumination(int nr_lights) {
		super();
		this.nr_lights = nr_lights;
	}

	/**
	 * Retorna o numero de luzes.
	 * 
	 * @return Int numero de luzes
	 */
	public int getNr_lights() {
		return nr_lights;
	}

}
