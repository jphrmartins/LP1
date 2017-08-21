package br.fundatec.lpi.smarthouse;

/**
 * Casa Inteligente: Nesta classe ocorre uma composição
 * 
 * @author JP
 */
public class SmartHome {

	private Ilumination obj_Ilumination;
	private Dweller obj_dweller;
	private Multmedia obj_multmedia;

	/**
	 * Retorna o sistema de iluminação
	 * @return Objeto do tipo Ilumination
	 */
	public Ilumination getObj_Ilumination() {
		return obj_Ilumination;
	}

	/**
	 * Atribui uma iluminação
	 * 
	 * @param obj_Ilumination
	 *            Objeto de iluminação pre-definido
	 */
	public void setObj_Ilumination(Ilumination obj_Ilumination) {
		this.obj_Ilumination = obj_Ilumination;
	}

	/**
	 * Retorna o morador da casa
	 * 
	 * @return Objeto do tipo Dweller
	 */
	public Dweller getObj_dweller() {
		return obj_dweller;
	}

	/**
	 * Atribui um morador a casa
	 * 
	 * @param obj_dweller
	 *            Morador pre-definido
	 */
	public void setObj_dweller(Dweller obj_dweller) {
		this.obj_dweller = obj_dweller;
	}

	/**
	 * Retorna o objeto multimidia da casa
	 * 
	 * @return Objeto do tipo Mulmedia
	 */
	public Multmedia getObj_multmedia() {
		return obj_multmedia;
	}

	/**
	 * Atribui um aparelho multmidia
	 * 
	 * @param obj_multmedia
	 *            Objeto de multmida pre-definido
	 */
	public void setObj_multmedia(Multmedia obj_multmedia) {
		this.obj_multmedia = obj_multmedia;
	}

	/**
	 * Acorda o morador da casa, ligando a iluminação da casa e o aparelho multimida
	 * caso o alarme do telefone do morador estiver ligado.
	 */
	public void weakingUPDwellerForCommitment() {
		if (this.obj_dweller.getObj_smartphone().getDs_alarme().equals("ON")) {
			this.obj_Ilumination.changeStatus("ON");
			this.obj_multmedia.changeStatus("ON");
			System.out.println("WeakUp DWELLEEEEEEEEEEEEEER");
		}
	}
}
