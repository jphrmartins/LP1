package br.fundatec.lpi.exemploaula1;

public class Estacionamento {

	private int nr_vagas;
	private int nr_vagasPreferencias;
	private int nr_carros;
	private String ds_status;
	private int nr_acessos;

	public Estacionamento(int nr_vagas, int nr_vagasPreferencias, int nr_acessos) {
		this.nr_vagas = nr_vagas;
		this.nr_vagasPreferencias = nr_vagasPreferencias;
		this.nr_acessos = nr_acessos;
		fecharEstacionamento();
	}

	public int getNr_carros() {
		return nr_carros;
	}

	public void setNr_carros(int nr_carros) {
		this.nr_carros = nr_carros;
	}

	public String getDs_status() {
		return ds_status;
	}

	public int getNr_vagas() {
		return nr_vagas;
	}

	public int getNr_vagasPreferencias() {
		return nr_vagasPreferencias;
	}

	public int getNr_acessos() {
		return nr_acessos;
	}

	public void adicionarVagas(int numVagas) {
		this.nr_vagas += numVagas;
	}

	public void adicionarVagasPreferencias(int numVagasPreferencias) {
		this.nr_vagasPreferencias += numVagasPreferencias;
	}

	public void abrirEstacionamento() {
		this.ds_status = "aberto";
	}

	public void fecharEstacionamento() {
		this.ds_status = "fechado";
	}

	public int consultarQtdLivre() {
		return (nr_vagas + nr_vagasPreferencias) - nr_carros;
	}

	public double calcularPorcentagemLivre() {
		int nr_vagasTotais = this.nr_vagas + this.nr_vagasPreferencias;
		int qtdLivre = consultarQtdLivre();
		return (qtdLivre * 100) / nr_vagasTotais;
	}
}
