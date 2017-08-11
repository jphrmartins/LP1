package br.fundatec.lpi.respunica;

public class Cliente {

	private String ds_nome;
	private String ds_documento;
	private Livro livroRetirado;
	
	public Cliente(String ds_nome) {
		super();
		this.ds_nome = ds_nome;
	}

	//getSet
	public String getDs_documento() {
		return ds_documento;
	}

	public void setDs_documento(String ds_documento) {
		this.ds_documento = ds_documento;
	}

	public Livro getLivroRetirado() {
		return livroRetirado;
	}

	public void setLivroRetirado(Livro livroRetirado) {
		this.livroRetirado = livroRetirado;
	}

	public String getDs_nome() {
		return ds_nome;
	}
	//fimGetSet
	
	
}
