package br.com.alura.screenmatch.modelos;

public class Titulo {

	private String nome;
	private int anoLancamento;
	private int duracaoEmMinutos;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacoes;
	private int totalDeAvaliacao;

	public void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento: " + anoLancamento);
		System.out.println("Duração: " + duracaoEmMinutos);
		System.out.println("Incluido no plano: " + incluidoNoPlano);
	}

	public void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalDeAvaliacao++;
	}

	public double pegaMedia() {
		return somaDasAvaliacoes / totalDeAvaliacao;

	}

	public String getNome() {
		return this.nome;
	}

	public int getAnoLancamento() {
		return this.anoLancamento;
	}

	public boolean getIncluidoNoPlano() {
		return this.incluidoNoPlano;
	}

	public int getTotalDeAvaliacoes() {
		return this.totalDeAvaliacao;
	}

	public int getDuracaoEmMinutos() {
		return this.duracaoEmMinutos;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

}
