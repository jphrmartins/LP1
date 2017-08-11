package br.fundatec.lpi.execoes;

public class Conta {
	private int vl_saldo;
	private int vl_limite;

	public Conta(int vl_saldo, int vl_limite) {
		this.vl_saldo = vl_saldo;
		this.vl_limite = vl_limite;
	}

	public int getVl_saldo() {
		return vl_saldo;
	}

	public int getVl_limite() {
		return vl_limite;
	}

	public void depositar(int vl_deposito) {
		this.vl_saldo += vl_deposito;
	}

	public boolean sacar(int vl_saque) {
		if (valorSaqueMaiorQueSaldoMaisLimite(vl_saque)) {
			return false;
		}
		this.vl_saldo -= vl_saque;
		return true;
	}

	private boolean valorSaqueMaiorQueSaldoMaisLimite(int vl_saque) {
		return vl_saque > this.vl_limite + this.vl_saldo;
	}

}
