package br.fundatec.lpi.exercicio3;

public class Poltrona extends Movel {

	private boolean bl_apoioBraco;
	private boolean bl_funcMassagem;
	
	public Poltrona(String ds_codigo, String ds_descricao, boolean bl_apoioBraco, boolean bl_funcMassagem) {
		super(ds_codigo, ds_descricao);
		this.bl_apoioBraco = bl_apoioBraco;
		this.bl_funcMassagem = bl_funcMassagem;
	}

	public boolean isBl_apoioBraco() {
		return bl_apoioBraco;
	}

	public boolean isBl_funcMassagem() {
		return bl_funcMassagem;
	}

	
}
