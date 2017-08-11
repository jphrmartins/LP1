package br.fundatec.lpi.respunica;

public class Livro {

	private String ds_titulo;
	private Autor ds_autor;
	private int num_anoPublicacao;
	
	public Livro(String ds_titulo, Autor ds_autor) {
		this.ds_titulo = ds_titulo;
		this.ds_autor = ds_autor;
	}

	public int getNum_anoPublicacao() {
		return num_anoPublicacao;
	}

	public void setNum_anoPublicacao(int num_anoPublicacao) {
		this.num_anoPublicacao = num_anoPublicacao;
	}

	public String getDs_titulo() {
		return ds_titulo;
	}

	public Autor getDs_autor() {
		return ds_autor;
	}
	
	

}
