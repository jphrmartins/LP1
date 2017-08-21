package br.fundatec.lpi.smarthouse;

/**
 * Classe abstrata que determina os eletronicos da casa.
 * 
 * @author JP
 *
 */
public abstract class Eletronic {
	private String ds_status;

	/**
	 * Construtor que inicializa se o eltronico está ligado ou não.
	 */
	public Eletronic() {
		this.ds_status = "OFF";
	}

	/**
	 * retorna se o aparelho está ligado ou não.
	 * 
	 * @return String dos Status
	 */
	public String getDs_status() {
		return ds_status;
	}

	/**
	 * atribui um novo status ao eletronico.
	 * 
	 * @param ds_status
	 *            novo status previamente passado.
	 */
	private void setDs_status(String ds_status) {
		this.ds_status = ds_status;
	}

	/**
	 * Liga ou desliga o aparelho
	 * 
	 * @param newStatus
	 *            novo status previamente passado.
	 */
	public void changeStatus(String newStatus) {
		newStatus = newStatus.toUpperCase();
		if (newStatus.equals("ON")) {
			setDs_status(newStatus);
		} else {
			setDs_status("OFF");
		}
	}

}
