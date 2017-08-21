package br.fundatec.lpi.smarthouse;

/**
 * Classe que cria um smartphone. Esta classe está associada a classe "Dweller"
 * 
 * @author JP
 * 
 */
public class Smartphone {
	private String ds_description;
	private String ds_alarme;

	/**
	 * Construtor da classe. Inicializao alarme do smartphone desligado.
	 * 
	 * @param ds_description
	 *            Nome do aparelho passado previamente
	 */
	public Smartphone(String ds_description) {
		super();
		this.ds_description = ds_description;
		this.ds_alarme = "OFF";
	}

	/**
	 * Retorna se o alarma está ligado ou não
	 * 
	 * @return String como o status do alarme
	 */
	public String getDs_alarme() {
		return ds_alarme;
	}

	/**
	 * Atribui um novo status para o alarme
	 * 
	 * @param ds_alarme
	 *            Novo status do alarme previamente passado
	 */
	private void setDs_alarme(String ds_alarme) {
		this.ds_alarme = ds_alarme;
	}

	/**
	 * Retorna o nome do aparelho
	 * 
	 * @return String com o nome do aparelho
	 */
	public String getDs_description() {
		return ds_description;
	}

	/**
	 * Liga e desliga o alarme do celular dependendo se o morador tem um
	 * compromisso.
	 * 
	 * @param dweller
	 *            Morador passado previamente.
	 */
	public void switchAlarmMode(Dweller dweller) {
		if (dweller.isBol_commitment()) {
			dweller.getObj_smartphone().setDs_alarme("ON");
		} else {
			dweller.getObj_smartphone().setDs_alarme("OFF");
		}

	}

}
