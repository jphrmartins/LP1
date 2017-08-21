package br.fundatec.lpi.smarthouse;

/**
 * Classe que se estende da classe "Eletronic". Representa o sistema multimidia
 * da casa.
 * 
 * @author JP
 *
 */
public class Multmedia extends Eletronic {
	private String nm_device;

	/**
	 * Cria um objeto desta classe, inicia o nome do dispositovo com um nome
	 * previamente passado.
	 * 
	 * @param nm_device
	 *            Nome previamente passado.
	 */
	public Multmedia(String nm_device) {
		super();
		this.nm_device = nm_device;
	}

	/**
	 * Retorna o nome do dispositvo de multimidia.
	 * 
	 * @return String nome do dispositivo
	 */
	public String getNm_device() {
		return nm_device;
	}

}
