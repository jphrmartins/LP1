package br.fundatec.lpi.smarthouse;

/**
 * Classe que cria um morador. Uma classe com associoções.
 * 
 * @author JP, Aluno da Ti11
 */
public class Dweller {
	private String nm_dweller;
	private Smartphone obj_smartphone;
	private boolean bol_commitment;
	private String ds_commitment;

	/**
	 * Construtor da classe morador, inicializa o morador como se ele não tivesse um
	 * compromisso
	 * 
	 * @param nm_dweller
	 *            Nome do morador pré-definido
	 */
	public Dweller(String nm_dweller) {
		super();
		this.nm_dweller = nm_dweller;
		this.bol_commitment = false;
	}

	/**
	 * Retorna o telefone do morador
	 * 
	 * @return Objeto do tipo Smartphone
	 */
	public Smartphone getObj_smartphone() {
		return obj_smartphone;
	}

	/**
	 * Atribui um telefone ao morador
	 * 
	 * @param obj_smartphone
	 *            Telefone pré-definido
	 */
	public void setObj_smartphone(Smartphone obj_smartphone) {
		this.obj_smartphone = obj_smartphone;
	}

	/**
	 * Retorna a descrição do compromisso do morador
	 * 
	 * @return String com a descrição do coemntario
	 */
	public String getDs_commitment() {
		return ds_commitment;
	}

	/**
	 * Atribui um compromisso do morador com uma descrição
	 * 
	 * @param ds_commitment
	 *            descrição do compromisso pré-definido
	 */
	private void setDs_commitment(String ds_commitment) {
		this.ds_commitment = ds_commitment;
	}

	/**
	 * Retorna o nome do morador
	 * 
	 * @return String nome do morador
	 */
	public String getNm_dweller() {
		return nm_dweller;
	}

	/**
	 * Reotrna se o morador possui ou não um compormisso
	 * 
	 * @return Boolean compromisso
	 */
	public boolean isBol_commitment() {
		return bol_commitment;
	}

	/**
	 * Atribui um novo compromisso ao morador e aciona o alarme do telefone.
	 * 
	 * @param newCommitment
	 *            Descrição de um compromisso passado anteriormente.
	 */
	public void addCommitment(String newCommitment) {
		setDs_commitment(newCommitment);
		this.bol_commitment = true;
		this.obj_smartphone.switchAlarmMode(this);
	}
}
