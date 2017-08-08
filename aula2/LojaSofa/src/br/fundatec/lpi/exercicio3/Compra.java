package br.fundatec.lpi.exercicio3;


public class Compra {

	private String ds_codigo;
	private Cliente ob_cliente;
	private Mesa ob_mesa;
	private Poltrona ob_poltrona;
	private Sofa ob_sofa;
	
	public Compra(String ds_codigo, Cliente cliente) {
		super();
		this.ds_codigo = ds_codigo;
		this.ob_cliente = cliente;
	}

	public String getDs_codigo() {
		return ds_codigo;
	}

	public Cliente getCliente() {
		return ob_cliente;
	}

	public Mesa getMesa() {
		return ob_mesa;
	}

	public void setMesa(Mesa mesa) {
		this.ob_mesa = mesa;
	}

	public Poltrona getPoltrona() {
		return ob_poltrona;
	}

	public void setPoltrona(Poltrona poltrona) {
		this.ob_poltrona = poltrona;
	}

	public Sofa getSofa() {
		return ob_sofa;
	}

	public void setSofa(Sofa sofa) {
		this.ob_sofa = sofa;
	}

	
	
}
