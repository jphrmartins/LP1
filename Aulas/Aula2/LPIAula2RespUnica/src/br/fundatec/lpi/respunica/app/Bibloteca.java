package br.fundatec.lpi.respunica.app;

import br.fundatec.lpi.respunica.Autor;
import br.fundatec.lpi.respunica.Cliente;
import br.fundatec.lpi.respunica.Livro;

public class Bibloteca {

	public static void main(String[] args) {

		Autor rusky = new Autor("Ruskovisky");
		rusky.setDs_nacionalidade("Russo");
		Livro comoCorrerNosCampos = new Livro("Como correr nos campos", rusky);
		comoCorrerNosCampos.setNum_anoPublicacao(1876);
		Cliente jp = new Cliente("jp");
		jp.setLivroRetirado(comoCorrerNosCampos);
		System.out.println(jp.getDs_nome() + " retira o livro: " + jp.getLivroRetirado().getDs_titulo()
				+ ", do autor: " + jp.getLivroRetirado().getDs_autor().getDs_nome() + ".");
	}

}
