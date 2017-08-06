package br.fundatec.lpi.exercicio3;


public class Compra {

	private String ds_codigo;
	private Cliente cliente;
	private Mesa mesa;
	private Poltrona poltrona;
	private Sofa sofa;
	
	public Compra(String ds_codigo, Cliente cliente) {
		super();
		this.ds_codigo = ds_codigo;
		this.cliente = cliente;
	}

	public String getDs_codigo() {
		return ds_codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Poltrona getPoltrona() {
		return poltrona;
	}

	public void setPoltrona(Poltrona poltrona) {
		this.poltrona = poltrona;
	}

	public Sofa getSofa() {
		return sofa;
	}

	public void setSofa(Sofa sofa) {
		this.sofa = sofa;
	}

	
	
}
