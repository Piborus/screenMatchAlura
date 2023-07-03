package screenMatchAlura;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {

	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);
        meuFilme.exibeFichaTecnica();
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());
		
		meuFilme.avalia(10);
		meuFilme.avalia(5);
		meuFilme.avalia(8);
		meuFilme.avalia(4);
		System.out.println("Total de avaliação: " + meuFilme.getTotalDeAvaliacoes());
		System.out.println("Média de avaliações do filme:  " + meuFilme.pegaMedia());
		
		Serie minhaSerie = new Serie();
		System.out.println();
		minhaSerie.setNome("Lost");
		minhaSerie.setAnoLancamento(2004);
		minhaSerie.setTemporada(6);
		minhaSerie.setEpisodiosPorTmeporada(17);
		minhaSerie.setMinutosPorEpisodio(48);
		minhaSerie.exibeFichaTecnica();
        System.out.println("Duração para maratonar: " + minhaSerie.getDuracaoEmMinutos() + " minutos");
        
    	Filme outroFilme = new Filme();
		outroFilme.setNome("Avatar 2: O caminho da agua");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoEmMinutos(192);
        
        System.out.println();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(meuFilme);
        calculadora.incluir(outroFilme);
        calculadora.incluir(minhaSerie);
        System.out.println(calculadora.getTempoTotal());
        
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
       
        
        Episodio episodio = new Episodio();
        System.out.println();
        episodio.setNumero(1);
        episodio.setNome("Lost");
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        
		
		
	}
}
